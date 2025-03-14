package com.example.productcrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productcrudapp.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>
{

}
