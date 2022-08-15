package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Admin;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Getter
@Setter
//public class AdminInDto implements ConverterToEntity<AdminInDto,Admin> {
public class AdminInDto {
    private Long id;
    private String fN;
    private String lN;
    private String username;
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{5,7}$")
    private String password;
    @Email
    private String email;
    private String address;


    public static Admin convertInDtoToEntity(AdminInDto adminInDto){
        Admin admin = new Admin();
        admin.setAddress(adminInDto.getAddress());
        admin.setEmail(adminInDto.getEmail());
        admin.setPassword(adminInDto.getPassword());
        admin.setUsername(adminInDto.getUsername());
        admin.setFN(adminInDto.getFN());
        admin.setLN(adminInDto.getLN());
        return admin;
    }

}
