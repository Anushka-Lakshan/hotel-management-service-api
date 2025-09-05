package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDto;

import java.util.List;

public class BranchPaginateResponseDto {
    private List<ResponseBranchDto> dataList;
    private long dataCount;
}
