package com.bagal.pojo.request;

import com.bagal.pojo.request.entities.Bookingdates;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder(setterPrefix = "set")
@Accessors(chain = true)
public class BookingReuest {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private Bookingdates bookingdates;
    private String additionalneeds;
    public static BookingReuest getBookingReuestBody() {
        return BookingReuest
                .builder()
                .setFirstname("John")
                .setLastname("brown")
                .setAdditionalneeds("breakfast")
                .setBookingdates(Bookingdates.builder().checkin("14-6-23").checkout("14-6-23").build())
                .setDepositpaid(true)
                .setTotalprice(234)
                .build();
    }
}
