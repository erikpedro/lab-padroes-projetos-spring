package com.github.erikpedro.lab.repository;

import com.github.erikpedro.lab.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, String> {
}
