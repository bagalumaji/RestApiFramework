package com.bagal.api;

import com.bagal.configs.FrameworkConfig;
import com.bagal.enums.ApiBaseConfigTypes;
import com.bagal.pojo.request.BookingReuest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public final class BookingApi {
    private BookingApi(){}

    public static Response getNewBooking(BookingReuest requestBooking){
        return given()
                .baseUri(FrameworkConfig.getValue(ApiBaseConfigTypes.BASE_URI.getValue()))
                .accept("application/json")
                .contentType(ContentType.JSON)
                .body(requestBooking)
                .log()
                .all()
                .when()
                .post(FrameworkConfig.getValue(ApiBaseConfigTypes.BASE_PATH.getValue()))
                .then()
                .log()
                .all()
                .extract()
                .response();

    }
}
