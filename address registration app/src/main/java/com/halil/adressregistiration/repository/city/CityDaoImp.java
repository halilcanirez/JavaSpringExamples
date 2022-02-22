package com.softtech.week2.repository.city;
import com.softtech.week2.model.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityDaoImp implements CityDao{
    private final CityRepository cityRepository;
    @Override
    public City createCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City getCityByPlateNumber(int plateNumber) {
        return cityRepository.findByPlate(plateNumber).get();
    }
}
