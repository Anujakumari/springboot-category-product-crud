package com.example.productcrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productcrudapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
