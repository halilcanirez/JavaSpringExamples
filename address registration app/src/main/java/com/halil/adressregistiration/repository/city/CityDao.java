package com.softtech.week2.repository.city;
import com.softtech.week2.model.City;
public interface CityDao {
    City createCity(City city);
    City getCityByPlateNumber(int plateNumber);
}
