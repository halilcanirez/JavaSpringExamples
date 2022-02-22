package com.softtech.week2.converter;

import com.softtech.week2.dto.country.CountryCreateDto;
import com.softtech.week2.dto.country.CountryResponse;
import com.softtech.week2.model.Country;
import org.springframework.stereotype.Service;

@Service
public class CountryConverter {
    public Country convertToCountry(CountryCreateDto countryCreateDto){
        Country country=new Country();
        country.setId(1L);
        country.setCountryName(countryCreateDto.getCountryName());
        return country;
    }


    public CountryResponse convertToCountryResponse(Country country){
        CountryResponse response= new CountryResponse();
        response.setId(country.getId());
        response.setCountryName(country.getCountryName());
        return response;
    }
}
