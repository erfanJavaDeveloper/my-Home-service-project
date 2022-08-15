package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Admin;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

//@Component
//public class AdminOutDto implements ConverterToOutDto<Admin, AdminOutDto> {
@Getter
@Setter
public class AdminOutDto {
    private Long id;


    public static AdminOutDto convertEntityToOutDto(Admin admin) {
        AdminOutDto adminOutDto = new AdminOutDto();
        adminOutDto.setId(admin.getId());
        return adminOutDto;
    }
}


