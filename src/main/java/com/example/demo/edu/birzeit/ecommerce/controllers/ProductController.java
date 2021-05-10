package com.example.demo.edu.birzeit.ecommerce.controllers;

import com.example.demo.edu.birzeit.ecommerce.models.Product;
import com.example.demo.edu.birzeit.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id){
        return productService.findProductById(id);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
}
