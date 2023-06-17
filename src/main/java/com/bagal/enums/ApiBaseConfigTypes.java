package com.bagal.enums;

public enum ApiBaseConfigTypes {
    BASE_URI("baseUri"),
    BASE_PATH("basePath"),
    AUTH_PATH("authPath");
    private String value;

    ApiBaseConfigTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

