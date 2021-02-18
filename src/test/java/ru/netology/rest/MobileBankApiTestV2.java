package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MobileBankApiTestV2 {

    @Test
    void shouldReturnDemoAccounts(){
        given()
                .baseUri("http://localhost:9999/api/v1")
        .when()
                .get("/demo/accounts")
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json; charset=UTF-8");


    }
}
