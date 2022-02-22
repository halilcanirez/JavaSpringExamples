package com.softtech.week2.repository.city;

import com.softtech.week2.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City,Long> {
    Optional<City> findByPlate(int plate);
}
