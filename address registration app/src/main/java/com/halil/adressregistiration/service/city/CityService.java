package com.softtech.week2.service.city;

import com.softtech.week2.dto.city.CityCreateDto;
import com.softtech.week2.dto.city.CityResponse;

public interface CityService {
    CityResponse getCityByPlateNumber(int plate);
    CityResponse cityCreate(CityCreateDto cityCreateDto);
}
