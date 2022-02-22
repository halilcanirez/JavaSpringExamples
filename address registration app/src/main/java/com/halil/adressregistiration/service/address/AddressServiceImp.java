package com.softtech.week2.service.address;

import com.softtech.week2.converter.AddressConverter;
import com.softtech.week2.dto.address.AddressCreateDto;
import com.softtech.week2.dto.address.AddressResponse;
import com.softtech.week2.model.*;
import com.softtech.week2.repository.address.AddressDao;
import com.softtech.week2.repository.city.CityDao;
import com.softtech.week2.repository.country.CountryDao;
import com.softtech.week2.repository.district.DistrictDao;
import com.softtech.week2.repository.neighborhood.NeighborhoodDao;
import com.softtech.week2.repository.street.StreetDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImp implements AddressService{
    private final AddressDao addressDao;
    private final AddressConverter addressConverter;
    private  final CityDao cityDao;
    private final CountryDao countryDao;
    private final DistrictDao districtDao;
    private final NeighborhoodDao neighborhoodDao;
    private  final StreetDao streetDao;


    @Override
    public AddressResponse createAddress(AddressCreateDto addressCreateDto) {
        City city = cityDao.getCityByPlateNumber(addressCreateDto.getCityPlate());
        Country country = countryDao.getCountry(addressCreateDto.getCountryId());
        District district = districtDao.getDistrictById(addressCreateDto.getDistrictId());
        Neighborhood neighborhood = neighborhoodDao.getNeighborhoodById(addressCreateDto.getNeighborhoodId());
        Street street = streetDao.getStreetById(addressCreateDto.getStreetId());
        Address address = addressConverter.convertToAddress(addressCreateDto, country, city, district, neighborhood, street);
        Address createdAddress = addressDao.createAddress(address);
        return addressConverter.convertToResponse(createdAddress);

    }
    @Override
    public AddressResponse getAddressById(Long id) {
        Address address = addressDao.getAddressById(id);
        return addressConverter.convertToResponse(address);
    }

    @Override
    public void deleteAddress(Long id) {
        addressDao.deleteAddress(id);
    }

}
