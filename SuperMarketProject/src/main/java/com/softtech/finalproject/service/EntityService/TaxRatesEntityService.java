package com.softtech.finalproject.service.EntityService;

import com.softtech.finalproject.dao.ProductTaxRatesDao;
import com.softtech.finalproject.gen.service.BaseEntityService;
import com.softtech.finalproject.model.TaxRatesEntity;
import org.springframework.stereotype.Service;

@Service
public class TaxRatesEntityService extends BaseEntityService<TaxRatesEntity, ProductTaxRatesDao> {
    public TaxRatesEntityService(ProductTaxRatesDao dao) {
        super(dao);
    }

    public Double findTaxRatesByProductType(String productType){
        return getDao().findByProductType(productType).getTaxRates();
    }

}
