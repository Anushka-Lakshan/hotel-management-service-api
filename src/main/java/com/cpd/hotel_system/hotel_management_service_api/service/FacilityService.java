package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.FacilityPaginateResponseDto;

public interface FacilityService {
    public void create(RequestFacilityDto dto);
    public void update(String id, RequestFacilityDto dto);
    public void delete(String id);
    public ResponseFacilityDto findById(String id);
    public FacilityPaginateResponseDto findAll(int page, int size, String roomId, String searchText);
}
