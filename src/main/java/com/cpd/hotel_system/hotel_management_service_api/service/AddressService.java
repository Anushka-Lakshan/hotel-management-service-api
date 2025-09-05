package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;


public interface AddressService {
    public void create(RequestAddressDto dto);
    public void update(String id, RequestAddressDto dto);
    public void delete(String id);
    public ResponseAddressDto findById(String id);
    public ResponseAddressDto findByBranchId(String id);
}
