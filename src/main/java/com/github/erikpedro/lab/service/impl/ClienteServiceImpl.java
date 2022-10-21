package com.github.erikpedro.lab.service.impl;

import com.github.erikpedro.lab.model.Cliente;
import com.github.erikpedro.lab.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public Iterable<Cliente> searchAll() {
        return null;
    }

    @Override
    public Cliente findbyId(Long id) {
        return null;
    }

    @Override
    public void insert(Cliente cliente) {

    }

    @Override
    public void update(Long id, Cliente cliente) {

    }

    @Override
    public void delete(Long id) {

    }
}
