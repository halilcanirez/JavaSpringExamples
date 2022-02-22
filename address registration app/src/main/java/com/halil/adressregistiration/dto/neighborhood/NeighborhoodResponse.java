package com.softtech.week2.dto.neighborhood;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NeighborhoodResponse {
    private Long id;
    private String neighborhoodName;
    private int postalCode;
    private Long districtId;
    private String districtNAme;
}
