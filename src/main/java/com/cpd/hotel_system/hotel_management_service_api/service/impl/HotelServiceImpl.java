package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.entity.Branch;
import com.cpd.hotel_system.hotel_management_service_api.entity.Hotel;
import com.cpd.hotel_system.hotel_management_service_api.repo.HotelRepo;
import com.cpd.hotel_system.hotel_management_service_api.service.HotelService;
import com.cpd.hotel_system.hotel_management_service_api.util.BytecodeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepo hotelRepo;
    private final BytecodeHandler bytecodeHandler;

    @Override
    public void create(RequestHotelDto dto) {
        try {
            hotelRepo.save(toHotel(dto));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(String id, RequestHotelDto dto) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ResponseHotelDto findById(String id) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    private Hotel toHotel(RequestHotelDto dto) throws SQLException {

        return dto==null?null:
                Hotel.builder()
                        .hotelName(dto.getHotelName())
                        .hotelId(UUID.randomUUID().toString())
                        .starRating(dto.getStarRating())
                        .description(bytecodeHandler.stringToBlob(dto.getDescription()))
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .activeStatus(true)
                        .startingFrom(dto.getStartingFrom())
                        .build();
    }

    private ResponseHotelDto toResponseHotelDto(Hotel hotel) throws SQLException {
        return hotel==null?null:
                ResponseHotelDto.builder()
                        .hotelId(hotel.getHotelId())
                        .hotelName(hotel.getHotelName())
                        .starRating(hotel.getStarRating())
                        .description(bytecodeHandler.blobToString(hotel.getDescription()))
                        .createdAt(hotel.getCreatedAt())
                        .updatedAt(hotel.getUpdatedAt())
                        .activeStatus(hotel.isActiveStatus())
                        .startingFrom(hotel.getStartingFrom())
                        .branches(hotel.getBranches().stream().map(b ->
                                {
                                    try {
                                        return toResponseBranchDto(b);
                                    }catch (SQLException e){
                                        throw new RuntimeException(e);
                                    }
                                }
                        ).toList())
                        .build();
    }

    private ResponseBranchDto toResponseBranchDto(Branch branch) throws SQLException {
        return branch==null?null:
                ResponseBranchDto.builder()
                        .branchId(branch.getBranchId())
                        .branchName(branch.getBranchName())
                        .branchType(branch.getBranchType())
                        .roomCount(branch.getRoomCount())
                        .build();


    }
}
