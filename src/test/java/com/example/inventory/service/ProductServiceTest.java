package com.example.inventory.service;

import com.example.inventory.dto.ProductDTO;
import com.example.inventory.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    @Mock
    private ProductRepository repository;
    @InjectMocks
    ProductService service;
    ProductDTO productDTO = new ProductDTO(null,"IPhone","Cellular phone",695.50,10);
    @Test
    public void testCreateProduct(){
        service.createProduct(productDTO);
    }

}