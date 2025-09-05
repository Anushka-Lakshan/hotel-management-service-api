package com.cpd.hotel_system.hotel_management_service_api.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestAddressDto {
    private String address;
    private String city;
    private String country;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String branchId;
}
