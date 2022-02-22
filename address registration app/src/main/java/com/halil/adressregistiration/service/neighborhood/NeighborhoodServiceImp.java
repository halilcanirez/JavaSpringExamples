package com.softtech.week2.service.neighborhood;

import com.softtech.week2.converter.NeighborhoodConverter;
import com.softtech.week2.dto.neighborhood.NeighborhoodCreateDto;
import com.softtech.week2.dto.neighborhood.NeighborhoodResponse;
import com.softtech.week2.dto.neighborhood.NeighborhoodUpdateDto;
import com.softtech.week2.model.District;
import com.softtech.week2.model.Neighborhood;
import com.softtech.week2.repository.district.DistrictDao;
import com.softtech.week2.repository.neighborhood.NeighborhoodDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NeighborhoodServiceImp implements NeighborhoodService{
    private final NeighborhoodDao neighborhoodDao;
    private final NeighborhoodConverter neighborhoodConverter;
    private final DistrictDao districtDao;
    @Override
    public NeighborhoodResponse createNeighborhood(NeighborhoodCreateDto neighborhoodCreateDto) {
        District district = districtDao.getDistrictById(neighborhoodCreateDto.getDistrictId());
        Neighborhood neighborhood = neighborhoodConverter.convertToNeighborhood(neighborhoodCreateDto, district);
        Neighborhood createdNeighborhood = neighborhoodDao.createNeighborhood(neighborhood);
        return neighborhoodConverter.convertToResponse(createdNeighborhood);
    }

    @Override
    public List<NeighborhoodResponse> getNeighborhoodList(Long districtId) {
        List<Neighborhood> neighborhoodList = neighborhoodDao.getNeighborhoodByDistrictId(districtId);
        return neighborhoodList.stream()
                .map(neighborhood -> neighborhoodConverter.convertToResponse(neighborhood))
                .collect(Collectors.toList());
    }

    @Override
    public NeighborhoodResponse updateName(NeighborhoodUpdateDto updateDto) {
        Neighborhood neighborhood = neighborhoodDao.getNeighborhoodById(updateDto.getId());
        neighborhood.setNeighborhoodName(updateDto.getNewName());
        Neighborhood newNgh = neighborhoodDao.createNeighborhood(neighborhood);
        return neighborhoodConverter.convertToResponse(newNgh);
    }


}
