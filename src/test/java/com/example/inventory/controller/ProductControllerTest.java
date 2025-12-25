package com.example.inventory.controller;

import com.example.inventory.dto.ProductDTO;
import com.example.inventory.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.any;

@WebMvcTest(ProductController.class)
class ProductControllerTest {
    @Autowired
    MockMvc mockMvc;
    @MockitoBean
    ProductService service;
    @Autowired
    ObjectMapper objectMapper;
    private String productName;
    private ProductDTO productDTO;

    @BeforeEach
    void setup(){
        long id = 123123L;
        productName = "Electric kettle";
        String productDescription = "No detail";
        double productPrice = 85d;
        int productQuantity = 300;
        productDTO = new ProductDTO(id, productName, productDescription, productPrice, productQuantity);
        Mockito.when(service.createProduct(any()))
                .thenReturn(productDTO);
    }
    @Test
    void testCreateProduct() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/product/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(productDTO))
        ).andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(productName));
    }

}