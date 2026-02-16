package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.FacilityPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomImagePaginateResponseDto;

public interface RoomImageService {

    public void create(RequestRoomImageDto dto);
    public void update(RequestRoomImageDto dto,String Id);
    public void delete(String Id);
    public ResponseRoomImageDto findById(String Id);
    public RoomImagePaginateResponseDto findAll(int page, int size, String roomId);
}
