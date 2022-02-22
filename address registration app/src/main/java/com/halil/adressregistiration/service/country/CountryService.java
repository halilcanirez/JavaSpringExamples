package com.softtech.week2.service.country;

import com.softtech.week2.dto.country.CountryCreateDto;
import com.softtech.week2.dto.country.CountryResponse;


public interface CountryService {
    CountryResponse getCountryById(Long id);
    CountryResponse createCountry(CountryCreateDto countryCreateDto);
}
