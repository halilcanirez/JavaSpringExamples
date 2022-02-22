package com.softtech.week2.converter;

import com.softtech.week2.dto.neighborhood.NeighborhoodCreateDto;
import com.softtech.week2.dto.neighborhood.NeighborhoodResponse;
import com.softtech.week2.model.District;
import com.softtech.week2.model.Neighborhood;
import org.springframework.stereotype.Service;


@Service
public class NeighborhoodConverter {

    public Neighborhood convertToNeighborhood(NeighborhoodCreateDto neighborhoodCreateDto, District district){
        Neighborhood neighborhood= new Neighborhood();
        neighborhood.setPostalCode(neighborhoodCreateDto.getPostalCode());
        neighborhood.setNeighborhoodName(neighborhoodCreateDto.getNeighborhoodName());
        neighborhood.setDistrict(district);
        return neighborhood;
    }

    public NeighborhoodResponse convertToResponse(Neighborhood neighborhood){
        return NeighborhoodResponse.builder()
                .id(neighborhood.getId())
                .neighborhoodName(neighborhood.getNeighborhoodName())
                .postalCode(neighborhood.getPostalCode())
                .districtId(neighborhood.getDistrict().getId())
                .districtNAme(neighborhood.getDistrict().getDistrictName())
                .build();
    }

}
