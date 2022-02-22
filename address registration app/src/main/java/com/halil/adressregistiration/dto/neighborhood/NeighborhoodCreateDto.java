package com.softtech.week2.dto.neighborhood;

import lombok.Data;

@Data
public class NeighborhoodCreateDto {
    private String neighborhoodName;
    private int postalCode;
    private Long districtId;
}
