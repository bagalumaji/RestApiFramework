package com.bagal.pojo.response.booking;

import com.bagal.pojo.response.booking.entities.Booking;
import lombok.Builder;
import lombok.Data;

@Builder(setterPrefix = "set")
@Data
public class ResponseBookingPojo {
    public int bookingid;
    public Booking booking;
}