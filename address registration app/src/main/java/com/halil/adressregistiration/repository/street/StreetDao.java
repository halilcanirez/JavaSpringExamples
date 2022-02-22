package com.softtech.week2.repository.street;

import com.softtech.week2.dto.street.StreetResponse;
import com.softtech.week2.dto.street.StreetUpdateDto;
import com.softtech.week2.model.Street;

import java.util.List;

public interface StreetDao {
    Street createStreet(Street street);
    Street getStreetById(Long id);
    List<Street> getStreetByNeighborhoodId(Long neighborhoodId);
}
