package com.softtech.week2.repository.address;

import com.softtech.week2.model.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressDaoImp implements  AddressDao{
    private final AddressRepository addressRepository;
    @Override
    public Address createAddress(Address address) {
        return  addressRepository.save(address);
    }

    @Override
    public Address getAddressById(Long id) {
       return addressRepository.findById(id).get();
    }

    @Override
    public void  deleteAddress(Long id) {
         addressRepository.deleteById(id);
    }
}
