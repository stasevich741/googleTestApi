package com.example.googletestapi.config;

import com.example.googletestapi.constant.TestConstants;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestConfig {
    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = TestConstants.RunVariable.server;
        RestAssured.basePath = TestConstants.RunVariable.path;
    }
}
