package com.softtech.finalproject.service;

import com.softtech.finalproject.model.ProductTypeEnum;
import com.softtech.finalproject.service.ProductCategories.ProductType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SellingPriceStrategy{

    private final Map<String, ProductType> strategyMap;

    public BigDecimal calculateSellingPrice(ProductTypeEnum productTypeEnum, BigDecimal sellingPrice){
      return strategyMap.get(productTypeEnum.getTypeName()).apply(sellingPrice,2.0);
    };
}
