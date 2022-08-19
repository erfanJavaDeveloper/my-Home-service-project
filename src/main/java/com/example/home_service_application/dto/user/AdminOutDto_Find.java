package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Admin;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdminOutDto_Find {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String address;

    public static AdminOutDto_Find convertEntityToAdminOutDto_Find(Admin admin){
        AdminOutDto_Find adminOutDto_find = new AdminOutDto_Find();
        adminOutDto_find.setEmail(admin.getEmail());
        adminOutDto_find.setAddress(admin.getAddress());
        adminOutDto_find.setFirstName(admin.getFirstName());
        adminOutDto_find.setLastName(admin.getLastName());
        adminOutDto_find.setUsername(admin.getUsername());
        adminOutDto_find.setPassword(admin.getPassword());
        return adminOutDto_find;
    }
}
