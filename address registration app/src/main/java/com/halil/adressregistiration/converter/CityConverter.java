package com.softtech.week2.converter;

import com.softtech.week2.dto.city.CityCreateDto;
import com.softtech.week2.dto.city.CityResponse;
import com.softtech.week2.model.City;
import org.springframework.stereotype.Service;

@Service
public class CityConverter {
    public City convertToCity(CityCreateDto cityCreateDto){
        City city= new City();
        city.setCityName(cityCreateDto.getCityName());
        city.setPlate(cityCreateDto.getPlateName());
        return city;
    }
    public CityResponse convertToCityResponse(City city){
        CityResponse response = new CityResponse();
        response.setId(city.getId());
        response.setCityName(city.getCityName());
        response.setPlateName(city.getPlate());
        return response;
    }
}
