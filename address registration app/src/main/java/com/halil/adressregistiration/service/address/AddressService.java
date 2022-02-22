package com.softtech.week2.service.address;

import com.softtech.week2.dto.address.AddressCreateDto;
import com.softtech.week2.dto.address.AddressResponse;
import com.softtech.week2.model.Address;

public interface AddressService {
    AddressResponse createAddress(AddressCreateDto addressCreateDto);
    AddressResponse getAddressById(Long id);
    void deleteAddress(Long id);

}
