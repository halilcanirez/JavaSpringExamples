package com.softtech.week2.converter;

import com.softtech.week2.dto.address.AddressCreateDto;
import com.softtech.week2.dto.address.AddressResponse;
import com.softtech.week2.model.*;
import org.springframework.stereotype.Service;

@Service
public class AddressConverter {
    public Address convertToAddress(AddressCreateDto addressCreateDto,
                                    Country country, City city,
                                    District district, Neighborhood neighborhood,
                                    Street street){
        Address address = new Address();
        address.setCountry(country);
        address.setCity(city);
        address.setDistrict(district);
        address.setNeighborhood(neighborhood);
        address.setStreet(street);
        address.setNameSurname(addressCreateDto.getNameSurname());
        address.setDoorNumber(addressCreateDto.getDoorNumber());
        address.setApartmentNumber(addressCreateDto.getApartmentNumber());
        return  address;
    }
    public AddressResponse convertToResponse(Address address){
        AddressResponse addressResponse= new AddressResponse();
        String addressInfo = address.getCountry().getCountryName()+" "+ address.getCity().getCityName()+ " "+
                address.getDistrict().getDistrictName()+" "+address.getNeighborhood().getNeighborhoodName()+" "+
                address.getStreet().getStreetName()+" "+address.getApartmentNumber()+" "+
                address.getDoorNumber();
        addressResponse.setAddressInfo(addressInfo);
        addressResponse.setNameSurname(address.getNameSurname());
        addressResponse.setId(address.getId());
        return addressResponse;
    }
}
