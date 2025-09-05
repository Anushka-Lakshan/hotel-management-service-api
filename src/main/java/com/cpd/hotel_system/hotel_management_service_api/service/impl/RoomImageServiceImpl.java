package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomImagePaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.service.RoomImageService;
import org.springframework.stereotype.Service;

@Service
public class RoomImageServiceImpl implements RoomImageService {
    @Override
    public void create(RequestRoomImageDto dto) {

    }

    @Override
    public void update(String id, RequestRoomImageDto dto) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ResponseRoomImageDto findById(String id) {
        return null;
    }

    @Override
    public RoomImagePaginateResponseDto findAll(int page, int size) {
        return null;
    }
}
