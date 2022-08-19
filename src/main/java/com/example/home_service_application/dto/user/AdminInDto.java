package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Admin;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class AdminInDto implements ConverterToEntity<AdminInDto,Admin> {
public class AdminInDto {
    private Long id;
    private String firstName;
    private String lastName;
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
        admin.setFirstName(adminInDto.getFirstName());
        admin.setLastName(adminInDto.getLastName());
        return admin;
    }

}
