package com.example.googletestapi;

import com.example.googletestapi.config.TestConfig;
import com.example.googletestapi.constant.TestConstants;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class FirstTest extends TestConfig {
    @Test
    public void myFirstTest() {
        given().log().uri()
                .when().get(TestConstants.Actions.SWAPI_GET_PEOPLE + "1")
                .then().log().body().statusCode(200);
    }
}
