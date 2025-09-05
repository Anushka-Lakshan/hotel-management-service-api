package com.cpd.hotel_system.hotel_management_service_api.dto.response;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
