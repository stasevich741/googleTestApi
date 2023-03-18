package com.example.googletestapi.constant;

public class TestConstant {
    public static class RunVariable {
        //        public static String server = Servers.SWAPI_URL;
        public static String server = Server.JSON_PLACEHOLDER_URL;
        public static String path = "";
    }

    public static class Server {
        public static String SWAPI_URL = "https://swapi.dev/";
        public static String JSON_PLACEHOLDER_URL = "https://jsonplaceholder.typicode.com";
        public static String GOOGLE_PACES_URL;
        public static String REQUESTBIN_URL = "https://eocycqbv0ls71mi.m.pipedream.net";
    }

    public static class Path {
        public static String SWAPI_PATH = "api/";
        public static String GOOGLE_PACES_PATH;
    }

    public static class Action {
        public static String SWAPI_GET_PEOPLE = "people/";
        public static String GOOGLE_PACES_PATH;
        public static String JSON_PLACEHOLDER_GET = "comments/";
        public static String JSON_PLACEHOLDER_PUT = "posts/1/";
        public static String JSON_PLACEHOLDER_DELETE = "posts/1/";
        public static String JSON_PLACEHOLDER_POST = "posts/";
    }
}
