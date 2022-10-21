package com.github.erikpedro.lab.service;

import com.github.erikpedro.lab.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> searchAll();

    Cliente findbyId(Long id);

    void insert(Cliente cliente);

    void update(Long id, Cliente cliente);

    void delete(Long id);

}
