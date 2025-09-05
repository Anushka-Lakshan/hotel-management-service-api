package com.cpd.hotel_system.hotel_management_service_api.dto.response;




import java.math.BigDecimal;
import java.util.List;

public class ResponseRoomDto {
    private String roomId;
    private String roomNumber;
    private String type;
    private int bedCount;
    private boolean isAvailable;
    private BigDecimal price;

    private List<ResponseFacilityDto> facilities;
    private List<ResponseRoomImageDto> roomImages;
}
