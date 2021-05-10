package com.example.demo.edu.birzeit.ecommerce.services;

import com.example.demo.edu.birzeit.ecommerce.models.Product;
import com.example.demo.edu.birzeit.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product findProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product deleteProduct(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(Product product) {
        Product p = findProductById(product.getProduct_id());

        if (p == null) {
            return null;
        }
        return productRepository.save(product);
    }


}

