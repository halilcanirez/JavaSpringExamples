package com.softtech.week2.repository.district;

import com.softtech.week2.model.City;
import com.softtech.week2.model.District;

import java.util.List;

public interface DistrictDao {
    District districtCreate(District district);
    List<District> districtList(City city);
    District getDistrictById(Long id);
}
