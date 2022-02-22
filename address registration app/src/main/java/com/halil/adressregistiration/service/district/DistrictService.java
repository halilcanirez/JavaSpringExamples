package com.softtech.week2.service.district;

import com.softtech.week2.dto.district.DistrictCreateDto;
import com.softtech.week2.dto.district.DistrictResponse;

import java.util.List;

public interface DistrictService {
    List<DistrictResponse> getdistrictListByCity(int plate);
    DistrictResponse districtCreate(DistrictCreateDto districtCreateDto);
}
