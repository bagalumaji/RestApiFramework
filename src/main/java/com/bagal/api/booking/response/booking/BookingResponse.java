package com.bagal.api.booking.response.booking;

import com.bagal.api.booking.response.booking.entities.Booking;
import lombok.Builder;
import lombok.Data;

@Builder(setterPrefix = "set")
@Data
public class BookingResponse {
    public int bookingid;
    public Booking booking;
}