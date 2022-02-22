package com.softtech.week2.repository.neighborhood;

import com.softtech.week2.model.Neighborhood;

import java.util.List;

public interface NeighborhoodDao {
    Neighborhood createNeighborhood(Neighborhood neighborhood);
    List<Neighborhood>  getNeighborhoodByDistrictId(Long districtId);
    Neighborhood getNeighborhoodById(Long id);

}
