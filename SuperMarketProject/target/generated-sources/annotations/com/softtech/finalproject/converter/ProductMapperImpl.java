package com.softtech.finalproject.converter;

import com.softtech.finalproject.dto.ProductDto;
import com.softtech.finalproject.dto.ProductResponse;
import com.softtech.finalproject.dto.UpdateProductDto;
import com.softtech.finalproject.model.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-20T13:32:40+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductEntity convertToProductEntity(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setProductName( productDto.getProductName() );
        productEntity.setTaxFreeSellingPrice( productDto.getTaxFreeSellingPrice() );
        productEntity.setProductType( productDto.getProductType() );

        return productEntity;
    }

    @Override
    public ProductResponse convertToProductResponse(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        productResponse.setId( productEntity.getId() );
        productResponse.setProductName( productEntity.getProductName() );
        productResponse.setProductPrice( productEntity.getProductPrice() );
        productResponse.setTaxFreeSellingPrice( productEntity.getTaxFreeSellingPrice() );
        productResponse.setProductType( productEntity.getProductType() );

        return productResponse;
    }

    @Override
    public List<ProductDto> convertToProductDtoList(List<ProductEntity> productList) {
        if ( productList == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( productList.size() );
        for ( ProductEntity productEntity : productList ) {
            list.add( productEntityToProductDto( productEntity ) );
        }

        return list;
    }

    @Override
    public ProductEntity convertToProduct(UpdateProductDto updateProductDto) {
        if ( updateProductDto == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setId( updateProductDto.getId() );
        productEntity.setProductName( updateProductDto.getProductName() );
        productEntity.setTaxFreeSellingPrice( updateProductDto.getTaxFreeSellingPrice() );
        productEntity.setProductType( updateProductDto.getProductType() );

        return productEntity;
    }

    protected ProductDto productEntityToProductDto(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setProductName( productEntity.getProductName() );
        productDto.setTaxFreeSellingPrice( productEntity.getTaxFreeSellingPrice() );
        productDto.setProductType( productEntity.getProductType() );

        return productDto;
    }
}
