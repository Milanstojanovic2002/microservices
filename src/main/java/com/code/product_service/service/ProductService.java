package com.code.product_service.service;


import com.code.product_service.dto.ProductRequest;
import com.code.product_service.dto.ProductResponse;
import com.code.product_service.model.Product;
import com.code.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(ProductRequest productRequest){
//        Product p=Product.builder()
//                .name(productRequest.getName())
//                .description(productRequest.getDescription())
//                .price(productRequest.getPrice())
//                .build();
        Product p=new Product();
        p.setDescription(productRequest.getDescription());
        p.setName(productRequest.getName());
        p.setPrice(productRequest.getPrice());
        productRepository.save(p);
//        log.info("Product {} is saved",p.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products= productRepository.findAll();
        List<ProductResponse> productResponses=new ArrayList<>();
        for(Product p: products){
            productResponses.add(mapToProductResponse(p));
        }
        return productResponses;
    }

    private ProductResponse mapToProductResponse(Product p){
//        return ProductResponse.builder()
//                .id(p.getId())
//                .name(p.getName())
//                .description(p.getDescription())
//                .price(p.getPrice())
//                .build();
        return new ProductResponse(p.getId(),p.getName(),p.getDescription(),p.getPrice());
    }

}
