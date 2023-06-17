package com.bagal.api.authtoken;

import com.bagal.configs.FrameworkConfig;
import com.bagal.enums.ApiBaseConfigTypes;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;


public class AuthApi {
    public static String getToken(){
        AuthBody authBody =AuthBody.getAuthBody();
        String token =  given()
                .baseUri(FrameworkConfig.getValue(ApiBaseConfigTypes.BASE_URI.getValue()))
                .accept("application/json")
                .contentType(ContentType.JSON)
                .body(authBody)
                .when()
                .post(FrameworkConfig.getValue(ApiBaseConfigTypes.AUTH_PATH.getValue()))
                .then()
                .log()
                .all()
                .extract()
                .response()
                .jsonPath()
                .getString("token");
        System.out.println("token = " + token);

        return token;
    }
}
