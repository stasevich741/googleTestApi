package com.example.googletestapi.config;

import com.example.googletestapi.constant.TestConstant;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;

public class TestConfig {

    protected static RequestSpecification requestSpecificationSwapiTest = new RequestSpecBuilder()
            .setBaseUri(TestConstant.Server.SWAPI_URL)
            .build();

    protected static RequestSpecification requestSpecificationJson = new RequestSpecBuilder()
            .addHeader("Content-Type", "application/json")
            .addCookie("testCookieJson")
            .setBaseUri(TestConstant.Server.JSON_PLACEHOLDER_URL)
            .build();

    protected static RequestSpecification requestSpecificationXml = new RequestSpecBuilder()
            .addHeader("Content-Type", "application/xml")
            .addCookie("testCookieXml")
            .setBaseUri(TestConstant.Server.REQUESTBIN_URL)
            .build();

    protected static ResponseSpecification responseSpecificationForGet = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();

    protected static ResponseSpecification responseSpecificationForPost = new ResponseSpecBuilder()
            .expectStatusCode(201)
            .build();

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = TestConstant.RunVariable.server;
        RestAssured.basePath = TestConstant.RunVariable.path;

        RestAssured.requestSpecification = requestSpecificationJson;
    }
}
