package com.softtech.finalproject.service.ProductCategories;

import com.softtech.finalproject.model.ProductTypeEnum;
import com.softtech.finalproject.service.EntityService.TaxRatesEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service(ProductTypeEnum.Name.FOOD)
@RequiredArgsConstructor
public class Food implements ProductType {
    private final TaxRatesEntityService taxRatesEntityService;
    @Override
    public BigDecimal apply(BigDecimal taxFreePrice, Double taxRate) {
        Double tax= taxRatesEntityService.findTaxRatesByProductType(ProductTypeEnum.Name.FOOD);
        return taxFreePrice.add(taxFreePrice.multiply(new BigDecimal(tax)));
    }
}
