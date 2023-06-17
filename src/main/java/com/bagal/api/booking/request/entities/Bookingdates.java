package com.bagal.api.booking.request.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Bookingdates {
    private String checkin;
    private String checkout;
}
