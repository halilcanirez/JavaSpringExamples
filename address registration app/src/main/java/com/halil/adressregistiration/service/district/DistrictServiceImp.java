package com.softtech.week2.service.district;

import com.softtech.week2.converter.DistrictConverter;
import com.softtech.week2.dto.district.DistrictCreateDto;
import com.softtech.week2.dto.district.DistrictResponse;
import com.softtech.week2.model.City;
import com.softtech.week2.model.District;
import com.softtech.week2.repository.city.CityDao;
import com.softtech.week2.repository.district.DistrictDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DistrictServiceImp implements DistrictService {
    private final DistrictDao districtDao;
    private final DistrictConverter converter;
    private final CityDao cityDao;


    @Override
    public List<DistrictResponse> getdistrictListByCity(int plate) {
        City city = cityDao.getCityByPlateNumber(plate);
        List<District> districtList = districtDao.districtList(city);
        List<DistrictResponse> districtResponses = districtList.stream()
                .map(district -> converter.convertToDistrictResponse(district))
                .collect(Collectors.toList());
        return districtResponses;
    }

    @Override
    public DistrictResponse districtCreate(DistrictCreateDto districtCreateDto){
        City city = cityDao.getCityByPlateNumber(districtCreateDto.getPlate());
        District district= converter.convertToDistrict(districtCreateDto,city);
        District createdDistrict=districtDao.districtCreate(district);
        return converter.convertToDistrictResponse(createdDistrict);
    }

}
