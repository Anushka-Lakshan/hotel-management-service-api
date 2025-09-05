package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomPaginateResponseDto;

public interface RoomService {
    public void create(RequestRoomDto dto);
    public void update(String id, RequestRoomDto dto);
    public void delete(String id);
    public ResponseRoomDto findById(String id);
    public RoomPaginateResponseDto findAll(int page, int size);
}
