package com.cpd.hotel_system.hotel_management_service_api.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomRequestDto {
    private String roomNumber;
    private String type;
    private int bedCount;
    private boolean isAvailable;
    private BigDecimal price;
    private String branchId;
}
