package com.softtech.week2.repository.address;

import com.softtech.week2.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {

}
