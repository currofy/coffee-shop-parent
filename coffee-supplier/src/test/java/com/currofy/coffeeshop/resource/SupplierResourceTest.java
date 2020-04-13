package com.currofy.coffeeshop.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SupplierResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/info")
          .then()
             .statusCode(200)
             .body(is("hello from your favourite supplier... always delivering your coffee"));
    }

}