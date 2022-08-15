package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Admin;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Setter
@Getter
public class AdminOutDto_Find {
    private Long id;
    private String fN;
    private String lN;
    private String username;
    private String password;
    private String email;
    private String address;

    public static AdminOutDto_Find convertEntityToAdminOutDto_Find(Admin admin){
        AdminOutDto_Find adminOutDto_find = new AdminOutDto_Find();
        adminOutDto_find.setEmail(admin.getEmail());
        adminOutDto_find.setAddress(admin.getAddress());
        adminOutDto_find.setFN(admin.getFN());
        adminOutDto_find.setLN(admin.getLN());
        adminOutDto_find.setUsername(admin.getUsername());
        adminOutDto_find.setPassword(admin.getPassword());
        return adminOutDto_find;
    }
}
