package com.example.googletestapi.config;

import com.example.googletestapi.constant.TestConstant;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestConfig {
    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = TestConstant.RunVariable.server;
        RestAssured.basePath = TestConstant.RunVariable.path;
    }
}
