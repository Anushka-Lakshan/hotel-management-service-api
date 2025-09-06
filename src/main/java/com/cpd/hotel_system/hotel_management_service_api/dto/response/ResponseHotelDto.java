package com.cpd.hotel_system.hotel_management_service_api.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseHotelDto {
    private String hotelId;
    private String hotelName;
    private int starRating;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean activeStatus;
    private BigDecimal startingFrom;

    private List<ResponseBranchDto> branches;
}
