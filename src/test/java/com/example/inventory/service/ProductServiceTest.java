package com.example.inventory.service;

import com.example.inventory.dto.ProductDTO;
import com.example.inventory.model.Product;
import com.example.inventory.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    @Mock
    private ProductRepository repository;
    @InjectMocks
    ProductService service;
    ProductDTO productDTO = new ProductDTO(null,"IPhone","Cellular phone",695.50,10);
    @BeforeEach
    void setup(){
        Product result = new Product(productDTO.name(), productDTO.description(),
                productDTO.price(), productDTO.quantity());
        result.setId(1234L);
        when(repository.save(any())).thenReturn(result);
    }
    @Test
    public void testCreateProduct(){
        service.createProduct(productDTO);
    }

}