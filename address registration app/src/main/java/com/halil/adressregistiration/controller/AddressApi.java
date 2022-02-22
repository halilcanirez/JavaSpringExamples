package com.softtech.week2.controller;

import com.softtech.week2.dto.address.AddressCreateDto;
import com.softtech.week2.dto.address.AddressResponse;
import com.softtech.week2.dto.city.CityCreateDto;
import com.softtech.week2.dto.city.CityResponse;
import com.softtech.week2.dto.country.CountryCreateDto;
import com.softtech.week2.dto.country.CountryResponse;
import com.softtech.week2.dto.district.DistrictCreateDto;
import com.softtech.week2.dto.district.DistrictResponse;
import com.softtech.week2.dto.neighborhood.NeighborhoodCreateDto;
import com.softtech.week2.dto.neighborhood.NeighborhoodResponse;
import com.softtech.week2.dto.neighborhood.NeighborhoodUpdateDto;
import com.softtech.week2.dto.street.StreetCreateDto;
import com.softtech.week2.dto.street.StreetResponse;
import com.softtech.week2.dto.street.StreetUpdateDto;
import com.softtech.week2.service.address.AddressService;
import com.softtech.week2.service.city.CityService;
import com.softtech.week2.service.country.CountryService;
import com.softtech.week2.service.district.DistrictService;
import com.softtech.week2.service.neighborhood.NeighborhoodService;
import com.softtech.week2.service.street.StreetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AddressApi {
    private final AddressService addressService;
    private final CountryService countryService;
    private final CityService cityService;
    private final DistrictService districtService;
    private final NeighborhoodService neighborhoodService;
    private final StreetService streetService;

    @PostMapping("/v1/country")
    public ResponseEntity<?> createCountry(@RequestBody CountryCreateDto countryCreateDto){
        return ResponseEntity.ok(countryService.createCountry(countryCreateDto));
    }

    @GetMapping("/v1/country/{id}")
    public ResponseEntity<?> getCountryById(@PathVariable Long id){
        final CountryResponse country = countryService.getCountryById(id);
        return ResponseEntity.ok(country);
    }

    @PostMapping("/v1/city")
    public ResponseEntity<CityResponse> createCity(@RequestBody CityCreateDto cityCreateDto){
        return ResponseEntity.ok(cityService.cityCreate(cityCreateDto));
    }
    @GetMapping("/v1/city/{plateNumber}")
    public ResponseEntity<?> getCityId(@PathVariable int plateNumber){
        final CityResponse city= cityService.getCityByPlateNumber(plateNumber);
        return  ResponseEntity.ok(city);
    }
    @PostMapping("/v1/district")
    public ResponseEntity<DistrictResponse> createDistrict(@RequestBody DistrictCreateDto districtCreateDto){
        return ResponseEntity.ok(districtService.districtCreate(districtCreateDto));
    }
    @GetMapping("/v1/district/{plateNumber}")
    public ResponseEntity<List<DistrictResponse>> getDistrictsByCityPlate(@PathVariable int plateNumber){
        return ResponseEntity.ok(districtService.getdistrictListByCity(plateNumber));
    }

    @PostMapping("/v1/neighborhood")
    public ResponseEntity<NeighborhoodResponse> createNeighborhood(@RequestBody NeighborhoodCreateDto createDto){
        return ResponseEntity.ok(neighborhoodService.createNeighborhood(createDto));
    }

    @GetMapping("/v1/neighborhood/{districtId}")
    public ResponseEntity<List<NeighborhoodResponse>> getNeighborhoodsByDistrictId(@PathVariable Long districtId){
        return ResponseEntity.ok(neighborhoodService.getNeighborhoodList(districtId));
    }
    @PutMapping("v1/neighborhood")
    public NeighborhoodResponse updateNeighborhoodName(@RequestBody NeighborhoodUpdateDto dto){
        return neighborhoodService.updateName(dto);
    }
    @PutMapping("v1/street")
    public StreetResponse updateStreetName(@RequestBody StreetUpdateDto dto){
        return streetService.updateName(dto);
    }
    @PostMapping("/v1/street")
    public ResponseEntity<StreetResponse> createStreet(@RequestBody StreetCreateDto streetCreateDto){
        return ResponseEntity.ok(streetService.createStreet(streetCreateDto));
    }
    @GetMapping("/v1/street/{neighborhoodId}")
    public ResponseEntity<List<StreetResponse>> getStreetByNeighborhoodId(@PathVariable Long neighborhoodId){
        return  ResponseEntity.ok(streetService.getStreetListByNeighborhoodId(neighborhoodId));
    }
    @PostMapping("/v1/address")
    public ResponseEntity<AddressResponse>  createAddress(@RequestBody AddressCreateDto addressCreateDto){
        return ResponseEntity.ok(addressService.createAddress(addressCreateDto));
    }
    @GetMapping("/v1/address/{addressId}")
    public ResponseEntity<AddressResponse> getAddressByAddressId(@PathVariable Long addressId){
        return ResponseEntity.ok(addressService.getAddressById(addressId));
    }
    @DeleteMapping("/v1/address/{addressId}")
    public ResponseEntity deleteAddress(@PathVariable Long id){
        addressService.deleteAddress(id);
        return  ResponseEntity.ok(Void.TYPE);
    }

}
