package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.BranchPaginateResponseDto;

public interface BranchService {
    public void create(RequestBranchDto dto);
    public void update(String id, RequestBranchDto dto);
    public void delete(String id);
    public ResponseBranchDto findById(String id);
    public BranchPaginateResponseDto findAll(int page, int size, String searchText);
    public BranchPaginateResponseDto findAllByHotelId(int page, int size, String hotelId, String searchText);
}
