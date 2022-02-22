package com.softtech.week2.service.street;

import com.softtech.week2.converter.StreetConverter;
import com.softtech.week2.dto.street.StreetCreateDto;
import com.softtech.week2.dto.street.StreetResponse;
import com.softtech.week2.dto.street.StreetUpdateDto;
import com.softtech.week2.model.Neighborhood;
import com.softtech.week2.model.Street;
import com.softtech.week2.repository.neighborhood.NeighborhoodDao;
import com.softtech.week2.repository.street.StreetDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StreetServiceImp implements StreetService{
    private final StreetDao streetDao;
    private final StreetConverter streetConverter;
    private final NeighborhoodDao neighborhoodDao;
    @Override
    public StreetResponse createStreet(StreetCreateDto streetCreateDto) {
        Neighborhood neighborhood=neighborhoodDao.getNeighborhoodById(streetCreateDto.getNeighborhoodId());
        Street street = streetConverter.convertToStreet(streetCreateDto, neighborhood);
        Street createdStreet = streetDao.createStreet(street);
        return streetConverter.convertToResponse(createdStreet);
    }
    public List<StreetResponse> getStreetListByNeighborhoodId(Long neighborhoodId){
        List<Street> streetList = streetDao.getStreetByNeighborhoodId(neighborhoodId);
        return streetList.stream()
                .map(street -> streetConverter.convertToResponse(street))
                .collect(Collectors.toList());
    }

    @Override
    public StreetResponse updateName(StreetUpdateDto dto) {
        Street street = streetDao.getStreetById(dto.getId());
        street.setStreetName(dto.getNewName());
        Street newStreet = streetDao.createStreet(street);
        return streetConverter.convertToResponse(newStreet);
    }
}
