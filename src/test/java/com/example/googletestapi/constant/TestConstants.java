package com.example.googletestapi.constant;

public class TestConstants {
    public static class RunVariable {
        public static String server = Servers.SWAPI_URL;
        public static String path = Path.SWAPI_PATH;
    }

    public static class Servers {
        public static String SWAPI_URL = "https://swapi.dev/";
        public static String GOOGLE_PACES_URL;
    }

    public static class Path {
        public static String SWAPI_PATH = "api/";
        public static String GOOGLE_PACES_PATH;
    }

    public static class Actions {
        public static String SWAPI_GET_PEOPLE = "people/";
        public static String GOOGLE_PACES_PATH;
    }
}
