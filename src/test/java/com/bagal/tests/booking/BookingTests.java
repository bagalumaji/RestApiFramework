package com.bagal.tests.booking;

import com.bagal.api.booking.BookingApi;
import com.bagal.api.booking.request.BookingBoody;
import com.bagal.api.authtoken.AuthApi;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingTests {
    @Test
    public void assertThatUserCanCreateANewBooking() {
        //arrange
        BookingBoody booking = BookingBoody.getBookingReuestBody();

        //act
        Response response = BookingApi.newBooking(booking);

        //assert
        response.then().assertThat().statusCode(200);
    }

    @Test
    public void assertThatUserCanCreateANewBookingByUsingOptionalParameter() {
        //arrange
        BookingBoody booking = BookingBoody.getBookingReuestBody();
        booking.setAdditionalneeds(null);

        //act
        Response response = BookingApi.newBooking(booking);

        //assert
        response.then().assertThat().statusCode(200);
    }

    @Test
    public void tokenTest() {
        AuthApi.getToken();
    }

    @Test
    public void assertThatUserCanCreateAndUpdateABooking() {
        //arrange
        BookingBoody booking = BookingBoody.getBookingReuestBody();

        //act
        Response response = BookingApi.newBooking(booking);

        String bookingId = response.jsonPath().getString("bookingid");

        booking.setFirstname("SayajiRaje");
        response = BookingApi.updateBooking(booking, bookingId);

        //assert
        response.then().assertThat().statusCode(200);
        String firstname = response.jsonPath().getString("firstname");
        Assert.assertEquals("SayajiRaje", firstname);
    }
}
