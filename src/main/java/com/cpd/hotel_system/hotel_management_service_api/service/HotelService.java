package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDto;

import java.sql.SQLException;

public interface HotelService {
    public void create(RequestHotelDto dto);
    public void update(String id, RequestHotelDto dto) throws SQLException;
    public void delete(String id);
    public ResponseHotelDto findById(String id) throws SQLException;
    public HotelPaginateResponseDto findAll(int page, int size, String searchText);
}
