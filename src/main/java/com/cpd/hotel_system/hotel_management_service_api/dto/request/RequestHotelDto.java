package com.cpd.hotel_system.hotel_management_service_api.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestHotelDto {

//    this section use for the only client side getting data other data we can tell
//     to spring boot as the adding the system

    private String description;
    private String hotelName;
    private int starRating;
    private BigDecimal startingFrom;
}
