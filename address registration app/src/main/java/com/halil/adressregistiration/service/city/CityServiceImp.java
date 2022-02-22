package com.softtech.week2.service.city;

import com.softtech.week2.converter.CityConverter;
import com.softtech.week2.dto.city.CityCreateDto;
import com.softtech.week2.dto.city.CityResponse;
import com.softtech.week2.model.City;
import com.softtech.week2.repository.city.CityDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServiceImp implements CityService{
    private final CityDao cityDao;
    private final CityConverter converter;

    @Override
    public CityResponse getCityByPlateNumber(int plate) {
        City retrievedCity = cityDao.getCityByPlateNumber(plate);
        return converter.convertToCityResponse(retrievedCity);
    }

    @Override
    public CityResponse cityCreate(CityCreateDto cityCreateDto) {
        City city= converter.convertToCity(cityCreateDto);
        City createdCity= cityDao.createCity(city);
        return converter.convertToCityResponse(createdCity);
    }
}
