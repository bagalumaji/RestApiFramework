package com.bagal.tests.booking;

import com.bagal.api.BookingApi;
import com.bagal.pojo.request.BookingReuest;
import com.bagal.pojo.request.entities.Bookingdates;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class BookingTests {
    @Test
    public void assertThatUserCanCreateANewBooking() {
        //arrange
        BookingReuest booking = BookingReuest.getBookingReuestBody();

        //act
        Response response = BookingApi.getNewBooking(booking);

        //assert
        response.then().assertThat().statusCode(200);
    }

    @Test
    public void assertThatUserCanCreateANewBookingByUsingOptionalParameter() {
        //arrange
        BookingReuest booking = BookingReuest.getBookingReuestBody();
        booking.setAdditionalneeds(null);

        //act
        Response response = BookingApi.getNewBooking(booking);

        //assert
        response.then().assertThat().statusCode(200);
    }
}
