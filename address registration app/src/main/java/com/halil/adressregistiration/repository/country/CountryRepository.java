package com.softtech.week2.repository.country;

import com.softtech.week2.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {

}
