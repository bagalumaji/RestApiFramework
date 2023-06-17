package com.bagal.api.booking;

import com.bagal.api.authtoken.AuthApi;
import com.bagal.basespec.BaseSpec;
import com.bagal.configs.FrameworkConfig;
import com.bagal.enums.ApiBaseConfigTypes;
import com.bagal.api.booking.request.BookingBoody;
import groovyjarjarantlr4.v4.codegen.model.SrcOp;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public final class BookingApi {
    private BookingApi(){}

    public static Response newBooking(BookingBoody requestBooking){
        return given()
                .spec(BaseSpec.get())
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
    //todo : refactor
    public static Response updateBooking(BookingBoody requestBooking, String bookingId){
        return given()
                .spec(BaseSpec.get(AuthApi.getToken()))
                .body(requestBooking)
                .log()
                .all()
                .when()
                .put(FrameworkConfig.getValue(ApiBaseConfigTypes.BASE_PATH.getValue())+"/"+bookingId)
                .then()
                .log()
                .all()
                .extract()
                .response();

    }

    public static Response partialUpdateBooking(BookingBoody requestBooking, String bookingId){
        return given()
                .spec(BaseSpec.get(AuthApi.getToken()))
                .body(requestBooking)
                .log()
                .all()
                .when()
                .put(FrameworkConfig.getValue(ApiBaseConfigTypes.BASE_PATH.getValue())+"/"+bookingId)
                .then()
                .log()
                .all()
                .extract()
                .response();

    }
    public static Response deleteBooking(String bookingId){
        return given()
                .spec(BaseSpec.get(AuthApi.getToken()))
                .log()
                .all()
                .when()
                .put(FrameworkConfig.getValue(ApiBaseConfigTypes.BASE_PATH.getValue())+"/"+bookingId)
                .then()
                .log()
                .all()
                .extract()
                .response();

    }
}
