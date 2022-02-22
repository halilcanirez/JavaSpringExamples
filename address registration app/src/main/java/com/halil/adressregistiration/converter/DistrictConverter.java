package com.softtech.week2.converter;

import com.softtech.week2.dto.district.DistrictCreateDto;
import com.softtech.week2.dto.district.DistrictResponse;
import com.softtech.week2.model.City;
import com.softtech.week2.model.District;
import org.springframework.stereotype.Service;

@Service
public class DistrictConverter {
    public District convertToDistrict(DistrictCreateDto districtCreateDto, City city){
        District district= new District();
        district.setDistrictName(districtCreateDto.getDistrictName());
        district.setCity(city);
        return district;
    }
    public DistrictResponse convertToDistrictResponse(District district){
        DistrictResponse response= new DistrictResponse();
        response.setId(district.getId());
        response.setDistrictName(district.getDistrictName());
        response.setCityName(district.getCity().getCityName());
        return response;
    }

}
