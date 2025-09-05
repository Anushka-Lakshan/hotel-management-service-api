package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDto;

public interface HotelService {
    public void create(RequestHotelDto dto);
    public void update(String id, RequestHotelDto dto);
    public void delete(String id);
    public ResponseHotelDto findById(String id);
    public HotelPaginateResponseDto findAll(int page, int size, String searchText);
}
