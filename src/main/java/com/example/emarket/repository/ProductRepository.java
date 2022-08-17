package com.example.emarket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.emarket.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> { }