package com.softtech.week2.dto.address;

import lombok.Data;

@Data
public class AddressCreateDto {
    private Long countryId;
    private String nameSurname;
    private int cityPlate;
    private Long districtId;
    private Long neighborhoodId;
    private Long streetId;
    private int doorNumber;
    private int apartmentNumber;

}
