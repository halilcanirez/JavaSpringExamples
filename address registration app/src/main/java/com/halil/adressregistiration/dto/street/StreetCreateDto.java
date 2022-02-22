package com.softtech.week2.dto.street;

import lombok.Data;

@Data
public class StreetCreateDto {
    private String streetName;
    private Long neighborhoodId;
}
