package com.example.springliveproject;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static io.restassured.module.mockmvc.matcher.RestAssuredMockMvcMatchers.*;


@SpringBootTest
public class TransactionComponentTest {

    @Test
    public void testApplicationEndToEnd() {

        // establish base uri default in before test, before class extension

        given().standaloneSetup(new TransactionController(new TransactionService()))
                .when()
                .get("/transactions/1234567")
                .then()
                .statusCode(Matchers.is(200));

    }
}
