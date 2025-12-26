package com.example.inventory.dto;

import jakarta.validation.constraints.NotBlank;

public record ProductDTO(Long id,
                         @NotBlank(message="Product name missing.") String name,
                         String description,
                         double price,
                         int quantity) {
}
