package com.chaitanya.ProductService.service;

import com.chaitanya.ProductService.model.ProductRequest;
import com.chaitanya.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
