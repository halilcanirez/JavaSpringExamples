package com.softtech.week2.repository.district;

import com.softtech.week2.model.City;
import com.softtech.week2.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,Long> {
    List<District> findAllByCity(City city);
}
