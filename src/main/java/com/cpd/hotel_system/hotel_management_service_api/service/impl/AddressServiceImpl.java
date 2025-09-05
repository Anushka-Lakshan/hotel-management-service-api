package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public void create(RequestAddressDto dto) {

    }

    @Override
    public void update(String id, RequestAddressDto dto) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ResponseAddressDto findById(String id) {
        return null;
    }

    @Override
    public ResponseAddressDto findByBranchId(String id) {
        return null;
    }
}
