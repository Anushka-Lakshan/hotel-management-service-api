package com.cpd.hotel_system.hotel_management_service_api.dto.request;

import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestBranchDto {
    private int roomCount;
    private BranchType branchType;
    private String branchName;
    private String hotelId;
}
