package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomImageDto {

    private String roomId;
    private MultipartFile file;
}
