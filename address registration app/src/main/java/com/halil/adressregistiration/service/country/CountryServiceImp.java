package com.softtech.week2.service.country;

import com.softtech.week2.converter.CountryConverter;
import com.softtech.week2.dto.country.CountryCreateDto;
import com.softtech.week2.dto.country.CountryResponse;
import com.softtech.week2.model.Country;
import com.softtech.week2.repository.country.CountryDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryServiceImp implements CountryService {

    private final CountryDao countryDao;
    private final CountryConverter converter;

    @Override
    public CountryResponse getCountryById(Long id) {
        Country retrievedCountry = countryDao.getCountry(id);
       return converter.convertToCountryResponse(retrievedCountry);
    }
    @Override
    public CountryResponse createCountry(CountryCreateDto countryCreateDto) {
        Country country=converter.convertToCountry(countryCreateDto);
        Country createdCountry = countryDao.createCountry(country);
        return converter.convertToCountryResponse(createdCountry);
    }
}
