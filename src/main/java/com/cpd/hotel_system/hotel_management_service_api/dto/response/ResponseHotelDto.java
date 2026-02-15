package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import com.cpd.hotel_system.hotel_management_service_api.entity.Branch;
import com.cpd.hotel_system.hotel_management_service_api.entity.Room;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseHotelDto {

    private String hotelId;
    private boolean activeStatus;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String hotelName;
    private int starRating;
    private BigDecimal startingFrom;

    //we need to send other branch details for the customer we can send like that |
//    Following 2 methods are right
//    private List<Branch> branches;

    private List<ResponseBranchDto> branches;



}
