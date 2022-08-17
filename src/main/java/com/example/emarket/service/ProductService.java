package com.example.emarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emarket.model.Product;
import com.example.emarket.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    /*public List<Product> getAllProducts() {
        return productRepository.findAll();
    }*/
    
}
