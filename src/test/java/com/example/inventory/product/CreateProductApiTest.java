package com.example.inventory.product;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class CreateProductApiTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/api";
    }
    @Disabled
    @Test
    void shouldCreateProductSuccessfully_whenValidDataProvided() {

        String requestBody = """
            {
              "name": "Laptop",
              "description": "Business laptop",
              "price": 1200.00,
              "quantity": 10
            }
            """;

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/products")
                .then()
                .statusCode(201)
                .body("id", notNullValue())
                .body("name", equalTo("Laptop"))
                .body("description", equalTo("Business laptop"))
                .body("price", equalTo(1200.00f))
                .body("quantity", equalTo(10));
    }
    @Disabled
    @Test
    void shouldReturn400_whenNameIsMissing() {

        String requestBody = """
        {
          "name": "",
          "description": "Business laptop",
          "price": 1200.00,
          "quantity": 10
        }
        """;

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/products")
                .then()
                .statusCode(400)
                .body("fieldErrors.name", equalTo("Product name missing."));
    }
    @Disabled
    @Test
    void shouldReturn400_whenQuantityIsZero() {

        String requestBody = """
        {
          "name": "Laptop",
          "description": "Business laptop",
          "price": 1200.00,
          "quantity": 0
        }
        """;

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/products")
                .then()
                .statusCode(400)
                .body("fieldErrors.quantity", equalTo("Quantity should be a positive integer."));
    }
    @Disabled
    @Test
    void shouldReturn400_whenQuantityIsNegative() {

        String requestBody = """
        {
          "name": "Laptop",
          "description": "Business laptop",
          "price": 1200.00,
          "quantity": -5
        }
        """;

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/products")
                .then()
                .statusCode(400)
                .body("fieldErrors.quantity", equalTo("Quantity should be a positive integer."));
    }

}
