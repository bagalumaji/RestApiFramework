package com.bagal.api.booking.response.booking.entities;

import com.bagal.api.booking.request.entities.Bookingdates;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "set")
public class Booking {
    public String firstname;
    public String lastname;
    public int totalprice;
    public boolean depositpaid;
    public Bookingdates bookingdates;
    public String additionalneeds;
}