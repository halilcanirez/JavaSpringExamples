package com.softtech.week2.repository.neighborhood;

import com.softtech.week2.model.Neighborhood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NeighborhoodDaoImp implements NeighborhoodDao {
    private final NeighborhoodRepository neighborhoodRepository;
    @Override
    public Neighborhood createNeighborhood(Neighborhood neighborhood) {
        return neighborhoodRepository.save(neighborhood);
    }

    @Override
    public List<Neighborhood> getNeighborhoodByDistrictId(Long districtId) {
        return neighborhoodRepository.findAllByDistrict_Id(districtId);
    }

    @Override
    public Neighborhood getNeighborhoodById(Long id) {
        return neighborhoodRepository.findById(id).get();
    }
}
