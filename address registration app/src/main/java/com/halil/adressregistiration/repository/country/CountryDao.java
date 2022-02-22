package com.softtech.week2.repository.country;

import com.softtech.week2.model.Country;

public interface CountryDao {
    Country createCountry(Country country);
    Country getCountry(Long id);
}
