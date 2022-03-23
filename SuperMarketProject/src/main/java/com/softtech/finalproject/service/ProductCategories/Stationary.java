package com.softtech.finalproject.service.ProductCategories;

import com.softtech.finalproject.model.ProductTypeEnum;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(ProductTypeEnum.Name.STATIONARY)
public class Stationary implements ProductType {
    @Override
    public BigDecimal apply(BigDecimal taxFreePrice, Double taxRate)  {
        return taxFreePrice.add(taxFreePrice.multiply(new BigDecimal(0.08)));
    }
}
