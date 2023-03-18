package com.example.googletestapi;

import com.example.googletestapi.config.TestConfig;
import com.example.googletestapi.constant.TestConstant;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class FirstTest extends TestConfig {
    @Test
    public void myFirstTest() {
        given().log().uri()
                .when().get(TestConstant.Action.SWAPI_GET_PEOPLE + "1")
                .then().log().body().statusCode(200);
    }
}
