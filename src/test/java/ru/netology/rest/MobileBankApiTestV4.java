package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class MobileBankApiTestV4 {

    @Test
    void shouldRetunDemoAccounts(){
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
        .when()
                .get("/demo/accounts")
                // Проверки
        .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("account.shema.json"));


    }
}
