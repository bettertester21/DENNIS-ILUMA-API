package com.bit.ProductApp.service;

import com.bit.ProductApp.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAllProducts();

    Product getProductById(Long Id);

    Product createProduct(Product product);

    Product updateProduct(Long is, Product productDetails);

    String deleteProduct(Long id);

}
