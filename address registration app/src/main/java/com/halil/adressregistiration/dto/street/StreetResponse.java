package com.softtech.week2.dto.street;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StreetResponse {
    private Long streetId;
    private String streetName;
    private Long neighborhoodId;
    private String neighborhoodName;

}
