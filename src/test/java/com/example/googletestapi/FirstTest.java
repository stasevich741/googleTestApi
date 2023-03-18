package com.example.googletestapi;

import com.example.googletestapi.config.TestConfig;
import com.example.googletestapi.constant.TestConstant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FirstTest extends TestConfig {
    @Test
    public void myFirstTest() {
        given().spec(requestSpecificationSwapiTest).log().uri()
                .when().get(TestConstant.Path.SWAPI_PATH)
                .then().body("people", equalTo("https://swapi.dev/api/people/")).log().body();
    }

    @Test
    @DisplayName("get some field is response with index assertion test")
    void getSomeFieldIsResponseWithIndexAssertionTest() {
        given().spec(requestSpecificationSwapiTest).log().uri()
                .when().get(TestConstant.Path.SWAPI_PATH + TestConstant.Action.SWAPI_GET_PEOPLE)
                .then()
                .body("count", equalTo(82))
                .body("results.name[0]", equalTo("Luke Skywalker"))
                .body("results.mass[0]", equalTo("77"))
                .body("results.name[1]", equalTo("C-3PO"))
                .log().body();
    }
}
