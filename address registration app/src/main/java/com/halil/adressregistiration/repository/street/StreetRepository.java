package com.softtech.week2.repository.street;

import com.softtech.week2.model.Street;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StreetRepository extends JpaRepository<Street,Long> {

    List<Street> findAllByNeighborhood_Id(Long neighborhoodId);
}
