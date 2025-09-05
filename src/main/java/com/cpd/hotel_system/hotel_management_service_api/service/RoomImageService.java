package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomImagePaginateResponseDto;

public interface RoomImageService {
    public void create(RequestRoomImageDto dto);
    public void update(String id, RequestRoomImageDto dto);
    public void delete(String id);
    public ResponseRoomImageDto findById(String id);
    public RoomImagePaginateResponseDto findAll(int page, int size);
}
