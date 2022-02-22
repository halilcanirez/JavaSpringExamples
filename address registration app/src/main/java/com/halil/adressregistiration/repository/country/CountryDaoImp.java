package com.softtech.week2.repository.country;

import com.softtech.week2.model.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryDaoImp implements CountryDao{

    private final CountryRepository countryRepository;

    @Override
    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country getCountry(Long id) {
        Optional<Country> country = countryRepository.findById(id);
        return  country.get();
    }
}
