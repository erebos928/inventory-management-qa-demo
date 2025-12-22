package com.example.inventory.repository;

import com.example.inventory.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;

@DataJpaTest
@TestPropertySource(locations = "classpath:application-test.properties")
class ProductRepositoryTest {

    @Test
    void testSaveProduct() {
        Product product = new Product("Laptop","Dell inspiron",1090.12,50);

    }
}