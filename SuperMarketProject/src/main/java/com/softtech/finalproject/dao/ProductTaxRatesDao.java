package com.softtech.finalproject.dao;

import com.softtech.finalproject.model.TaxRatesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTaxRatesDao extends JpaRepository<TaxRatesEntity,Long> {
    Double findTaxRatesByProductType(String productType);
    TaxRatesEntity findByProductType(String type);
}
