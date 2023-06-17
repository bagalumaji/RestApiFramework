package com.bagal.basespec;

import com.bagal.configs.FrameworkConfig;
import com.bagal.enums.ApiBaseConfigTypes;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public final class BaseSpec {
    private BaseSpec(){}

    public static RequestSpecification get(){
        return new RequestSpecBuilder()
                .setBaseUri(FrameworkConfig.getValue(ApiBaseConfigTypes.BASE_URI.getValue()))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
    }
    public static RequestSpecification get(String token){
        return get().cookie("token", token);
    }

}
