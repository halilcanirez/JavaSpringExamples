package com.softtech.week2.service.street;

import com.softtech.week2.dto.street.StreetCreateDto;
import com.softtech.week2.dto.street.StreetResponse;
import com.softtech.week2.dto.street.StreetUpdateDto;

import java.util.List;

public interface StreetService {
    StreetResponse createStreet(StreetCreateDto streetCreateDto);
    List<StreetResponse> getStreetListByNeighborhoodId(Long neighborhoodId);
    StreetResponse updateName(StreetUpdateDto dto);

}
