package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Customer;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerOutDto {
    private Long id;

    public static CustomerOutDto convertEntityToOutDto(Customer customer){
        CustomerOutDto customerOutDto = new CustomerOutDto();
        customerOutDto.setId(customer.getId());
        return customerOutDto;
    }
}
