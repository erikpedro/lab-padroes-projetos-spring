package com.github.erikpedro.lab.service.impl;

import com.github.erikpedro.lab.model.Address;
import com.github.erikpedro.lab.model.Cliente;
import com.github.erikpedro.lab.repository.AddressRepository;
import com.github.erikpedro.lab.repository.ClienteReopository;
import com.github.erikpedro.lab.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * The type Cliente service.
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteReopository clienteReopository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> searchAll() {
        return clienteReopository.findAll();
    }

    @Override
    public Cliente findbyId(Long id) {
        Optional<Cliente> cliente = clienteReopository.findById(id);
        return cliente.get();
    }

    @Override
    public void insert(Cliente cliente) {
        persist(cliente);
    }



    @Override
    public void update(Long id, Cliente cliente) {
        Optional<Cliente> clienteDb = clienteReopository.findById(id);
        if(clienteDb.isPresent()){
            persist(cliente);
        }

    }

    @Override
    public void delete(Long id) {
        clienteReopository.deleteById(id);
    }

    private void persist(Cliente cliente) {
        String cep = cliente.getAddress().getCep();
        Optional<Address> address = addressRepository.findById(cep);
        address.orElseGet(() -> {
            Address Newaddress = viaCepService.searchCep(cep);
            addressRepository.save(Newaddress);
            return Newaddress;
        });
    }
}
