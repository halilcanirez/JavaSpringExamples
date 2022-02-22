package com.softtech.week2.converter;

import com.softtech.week2.dto.street.StreetCreateDto;
import com.softtech.week2.dto.street.StreetResponse;
import com.softtech.week2.model.Neighborhood;
import com.softtech.week2.model.Street;
import org.springframework.stereotype.Service;

@Service
public class StreetConverter {
    public Street convertToStreet(StreetCreateDto streetCreateDto, Neighborhood neighborhood){
        Street street = new Street();
        street.setStreetName(streetCreateDto.getStreetName());
        street.setNeighborhood(neighborhood);
        return street;
    }
    public StreetResponse convertToResponse(Street street){
        return StreetResponse.builder()
                .streetId(street.getId())
                .streetName(street.getStreetName())
                .neighborhoodName(street.getNeighborhood().getNeighborhoodName())
                .neighborhoodId(street.getNeighborhood().getId())
                .build();

    }
}
