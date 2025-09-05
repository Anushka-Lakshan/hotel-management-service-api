package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.service.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    @Override
    public void create(RequestRoomDto dto) {

    }

    @Override
    public void update(String id, RequestRoomDto dto) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ResponseRoomDto findById(String id) {
        return null;
    }

    @Override
    public RoomPaginateResponseDto findAll(int page, int size) {
        return null;
    }
}
