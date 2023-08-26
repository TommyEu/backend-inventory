package com.project.inventory.controller;

import com.project.inventory.model.Movement;
import com.project.inventory.model.Product;
import com.project.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    /*@GetMapping("/{productId}/movements")
    public List<Movement> getAllMovementsForProduct(@PathVariable Long productId) {
        return productService.getAllMovementsForProduct(productId);
    }*/
}
