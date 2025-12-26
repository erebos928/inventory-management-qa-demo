package com.example.inventory.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record ProductDTO(Long id,
                         @NotBlank(message="Product name missing.") String name,
                         String description,
                         double price,
                         @Positive(message="Quantity should be a positive integer.") int quantity) {
}
