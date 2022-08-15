package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Admin;
import com.example.home_service_application.entity.users.Customer;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerOutDto_Find {
    private Long id;
    private String fN;
    private String lN;
    private String username;
    private String password;
    private String email;
    private String address;

    public static CustomerOutDto_Find convertEntityToAdminOutDto_Find(Customer customer){
        CustomerOutDto_Find customerOutDto_find = new CustomerOutDto_Find();
        customerOutDto_find.setEmail(customer.getEmail());
        customerOutDto_find.setAddress(customer.getAddress());
        customerOutDto_find.setFN(customer.getFN());
        customerOutDto_find.setLN(customer.getLN());
        customerOutDto_find.setUsername(customer.getUsername());
        customerOutDto_find.setPassword(customer.getPassword());
        return customerOutDto_find;
    }
}
