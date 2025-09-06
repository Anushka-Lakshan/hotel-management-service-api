package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import com.cpd.hotel_system.hotel_management_service_api.entity.Branch;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAddressDto {
    private String addressId;
    private String address;
    private String city;
    private String country;
    private BigDecimal longitude;
    private BigDecimal latitude;
    
    private Branch branch;
}
