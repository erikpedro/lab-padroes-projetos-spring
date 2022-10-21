package com.github.erikpedro.lab.repository;

import com.github.erikpedro.lab.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteReopository extends CrudRepository<Cliente, Long> {
}
