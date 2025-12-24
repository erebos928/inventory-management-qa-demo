package com.example.inventory.service;

import com.example.inventory.dto.ProductDTO;
import com.example.inventory.model.Product;
import com.example.inventory.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository repository;
    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
    @Transactional
    public void createProduct(ProductDTO productDTO){
        Product product = Product.fromDTO(productDTO);
        repository.save(product);
    }
}
