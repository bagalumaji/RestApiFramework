package com.bagal.constants;

import lombok.Getter;

import javax.swing.*;

public final class Constants {
    private Constants(){}

    private static final String API_KEY = "special-key";
    private static final String RESOURCE_PATH = System.getProperty("user.dir");
    private static @Getter
    final String APPLICATION_PROPERTIES_PATH = RESOURCE_PATH+"/src/test/resources/configs/application.properties";
    private static final @Getter String bookJsonSchema = RESOURCE_PATH+"/src/test/resources/schemas/pet.json";

}
