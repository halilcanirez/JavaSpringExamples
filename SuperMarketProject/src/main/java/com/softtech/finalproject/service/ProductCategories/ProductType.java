package com.softtech.finalproject.service.ProductCategories;

import java.math.BigDecimal;

public interface ProductType {
    BigDecimal apply(BigDecimal taxFreePrice, Double taxRate);
}
