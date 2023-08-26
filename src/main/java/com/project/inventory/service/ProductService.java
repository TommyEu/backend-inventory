package com.project.inventory.service;

import com.project.inventory.model.Product;
import com.project.inventory.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{
    ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
    }
    public void getProduct(String sku){
        productRepository.getReferenceById(sku);
    }
    public void deleteProduct(String sku){
        productRepository.deleteById(sku);
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
