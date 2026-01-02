package com.example.inventory.controller;

import com.example.inventory.dto.ProductDTO;
import com.example.inventory.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService service;
    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasAuthority('product:write')")
    public ProductDTO createProduct(@Valid @RequestBody ProductDTO productDTO){
        return service.createProduct(productDTO);
    }
}
