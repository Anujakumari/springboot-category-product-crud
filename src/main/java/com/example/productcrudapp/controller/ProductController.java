package com.example.productcrudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productcrudapp.dto.PagedResponse;
import com.example.productcrudapp.entity.Product;
import com.example.productcrudapp.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController 
{
	@Autowired
    private ProductService productService;

	@GetMapping
	public PagedResponse<Product> getAllProducts(Pageable pageable) {
	    Page<Product> productPage = productService.getAllProducts(pageable);
	    return new PagedResponse<>(productPage); // Wrap the response in PagedResponse
	}

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
