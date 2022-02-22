package com.softtech.week2.service.neighborhood;

import com.softtech.week2.dto.neighborhood.NeighborhoodCreateDto;
import com.softtech.week2.dto.neighborhood.NeighborhoodResponse;
import com.softtech.week2.dto.neighborhood.NeighborhoodUpdateDto;

import java.util.List;

public interface NeighborhoodService {
    NeighborhoodResponse createNeighborhood(NeighborhoodCreateDto neighborhoodCreateDto);
    List<NeighborhoodResponse> getNeighborhoodList(Long districtId);
    NeighborhoodResponse updateName(NeighborhoodUpdateDto updateDto);
}
