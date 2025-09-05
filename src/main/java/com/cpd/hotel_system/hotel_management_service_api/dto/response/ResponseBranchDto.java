package com.cpd.hotel_system.hotel_management_service_api.dto.response;


import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;

import java.util.List;

public class ResponseBranchDto {
    private String branchId;
    private int roomCount;
    private BranchType branchType;
    private String branchName;
    private List<ResponseHotelDto> rooms;
}
