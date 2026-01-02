package com.example.inventory.product;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class KeycloakTokenProvider {

    public static String getAccessToken() {
        return given()
                .log().all()
                .contentType(ContentType.URLENC)
                .formParam("grant_type", "client_credentials")
                .formParam("client_id", "inventory-api")
                .formParam("client_secret", "sumsMBoSxjPaQA3DpcLA0erYdxuMsElA")
                .when()
                .post("http://localhost:8080/realms/inventory-realm/protocol/openid-connect/token")
                .then()
                .statusCode(200)
                .extract()
                .path("access_token");
    }
}
