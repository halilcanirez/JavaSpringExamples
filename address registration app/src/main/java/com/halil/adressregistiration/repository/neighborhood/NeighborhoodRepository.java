package com.softtech.week2.repository.neighborhood;

import com.softtech.week2.model.District;
import com.softtech.week2.model.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NeighborhoodRepository extends JpaRepository<Neighborhood,Long> {
    List<Neighborhood> findAllByDistrict_Id(Long districtId);
}
