package com.softtech.week2.repository.district;

import com.softtech.week2.model.City;
import com.softtech.week2.model.District;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictDaoImp implements DistrictDao{
    private final DistrictRepository districtRepository;
    @Override
    public District districtCreate(District district) {
        District createdDistrict = districtRepository.save(district);
        return createdDistrict;
    }

    @Override
    public List<District> districtList(City city) {
        return districtRepository.findAllByCity(city);
    }

    @Override
    public District getDistrictById(Long id) {
        return districtRepository.findById(id).get();
    }
}
