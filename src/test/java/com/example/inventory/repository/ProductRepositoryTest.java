package com.example.inventory.repository;

import com.example.inventory.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DataJpaTest
class ProductRepositoryTest {
    @Autowired
    ProductRepository repository;

    static Product product;

    @BeforeAll
    static void setUp() {
        product = new Product("Laptop", "Dell Inspiron", 1090.12, 50);
    }

    @Test
    void testSaveProduct() {
        Product saved = repository.save(product);
        Optional<Product> optionalProduct = repository.findById(saved.getId());
        assertFalse(optionalProduct.isEmpty());
        assertEquals(optionalProduct.get().getName(),product.getName());
    }
}
