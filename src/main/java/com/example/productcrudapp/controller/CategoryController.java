package com.example.productcrudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productcrudapp.dto.PagedResponse;
import com.example.productcrudapp.entity.Category;
import com.example.productcrudapp.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController 
{
	@Autowired
    private CategoryService categoryService;
	
	@GetMapping
	public PagedResponse<Category> getAllCategories(Pageable pageable) {
	    Page<Category> categoryPage = categoryService.getAllCategories(pageable);
	    return new PagedResponse<>(categoryPage); 
	}

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }

}
