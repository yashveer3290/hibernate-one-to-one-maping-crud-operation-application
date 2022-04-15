package com.sunglowsys.repository;

import com.sunglowsys.domain.Address;

import java.util.List;

public interface AddressRepository {

    Address save(Address address);

    Address update(Address address,Long id);

    List<Address> findAll();

    Address findById(Long id);

    void delete(Long id);
}
