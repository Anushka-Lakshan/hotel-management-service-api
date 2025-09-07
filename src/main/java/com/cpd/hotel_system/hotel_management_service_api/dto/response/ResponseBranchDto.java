package com.cpd.hotel_system.hotel_management_service_api.dto.response;


import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBranchDto {
    private String branchId;
    private int roomCount;
    private BranchType branchType;
    private String branchName;
//    private List<ResponseHotelDto> rooms;
}
