package com.example.inventory.model;


import com.example.inventory.dto.ProductDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Unique ID for the product

    private String name;  // Name of the product
    private String description;  // Description of the product
    private double price;  // Price of the product
    private int quantity;  // Quantity in stock

    // Default constructor (required by JPA)
    public Product() {
    }

    // Constructor with all fields
    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static Product fromDTO(ProductDTO productDTO){
        return new Product(productDTO.name(),productDTO.description(),productDTO.price(),productDTO.quantity());
    }
    // toString method for easy debugging
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
