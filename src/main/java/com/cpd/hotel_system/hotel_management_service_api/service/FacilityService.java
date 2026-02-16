package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.AddressPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.FacilityPaginateResponseDto;

public interface FacilityService {

    public void create(RequestFacilityDto dto);
    public void update(RequestFacilityDto dto,String Id);
    public void delete(String Id);
    public ResponseFacilityDto findById(String Id);
    public FacilityPaginateResponseDto findAll(int page, int size, String roomId);
}
