package com.softtech.week2.repository.address;

import com.softtech.week2.model.Address;

public interface AddressDao {
    Address createAddress(Address address);
    Address getAddressById(Long id);
    void deleteAddress(Long id);
}
