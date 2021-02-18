package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class MobileBankApiTestV3 {

    @Test
    void sholdReturnDemoAccounts(){
        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
        .when()
                .get("/demo/accounts")
                // Проверки
        .then()
                .statusCode(200)
                .body("[0].currency", equalTo("RUB"))
                .body("[1].id", equalTo(2))
                .body("[2].balance", greaterThanOrEqualTo(0))
                .body("[1].balance", lessThan(3000000))
                .body("", hasSize(3))
                .body("[1].currency", equalTo("USD"));
    }
}
