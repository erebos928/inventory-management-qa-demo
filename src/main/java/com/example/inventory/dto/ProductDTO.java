package com.example.inventory.dto;

public record ProductDTO(Long id,String name,String description, double price, int quantity) {
}
