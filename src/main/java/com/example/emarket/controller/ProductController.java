package com.example.emarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emarket.model.Product;
import com.example.emarket.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    /* @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    } */
    
}
