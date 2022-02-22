package com.softtech.week2.repository.street;

import com.softtech.week2.dto.street.StreetResponse;
import com.softtech.week2.dto.street.StreetUpdateDto;
import com.softtech.week2.model.Street;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StreetDaoImp implements StreetDao{
    private final StreetRepository streetRepository;
    @Override
    public Street createStreet(Street street) {
        return streetRepository.save(street);
    }

    @Override
    public Street getStreetById(Long id) {
        return streetRepository.findById(id).get();
    }

    @Override
    public List<Street> getStreetByNeighborhoodId(Long neighborhoodId) {
        return streetRepository.findAllByNeighborhood_Id(neighborhoodId);
    }


}
