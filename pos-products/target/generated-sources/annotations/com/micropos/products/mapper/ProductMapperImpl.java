package com.micropos.products.mapper;

import com.micropos.products.dto.ProductDto;
import com.micropos.products.model.Product;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Collection<ProductDto> toProductsDto(Collection<Product> products) {
        if ( products == null ) {
            return null;
        }

        Collection<ProductDto> collection = new ArrayList<ProductDto>( products.size() );
        for ( Product product : products ) {
            collection.add( toProductDto( product ) );
        }

        return collection;
    }

    @Override
    public Collection<Product> toProducts(Collection<ProductDto> products) {
        if ( products == null ) {
            return null;
        }

        Collection<Product> collection = new ArrayList<Product>( products.size() );
        for ( ProductDto productDto : products ) {
            collection.add( toProduct( productDto ) );
        }

        return collection;
    }

    @Override
    public Product toProduct(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( productDto.getProductId() );
        product.setId( productDto.getId() );
        product.setName( productDto.getName() );
        if ( productDto.getPrice() != null ) {
            product.setPrice( productDto.getPrice() );
        }
        product.setImage( productDto.getImage() );

        return product;
    }

    @Override
    public ProductDto toProductDto(Product pet) {
        if ( pet == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setProductId( pet.getProductId() );
        productDto.setId( pet.getId() );
        productDto.setName( pet.getName() );
        productDto.setPrice( pet.getPrice() );
        productDto.setImage( pet.getImage() );

        return productDto;
    }
}
