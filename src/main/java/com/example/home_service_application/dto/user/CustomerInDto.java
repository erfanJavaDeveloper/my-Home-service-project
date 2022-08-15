package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Customer;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

//public class CustomerInDto implements ConverterToEntity<CustomerInDto,Customer> {
@Setter
@Getter
public class CustomerInDto{
    private Long id;
    private String fN;
    private String lN;
    private String username;
    private String password;
    @Email
    private String email;
    private String address;

    public Customer convertInDtoToEntity(CustomerInDto customerInDto) {
        Customer customer = new Customer();
        customer.setAddress(customerInDto.getAddress());
        customer.setEmail(customerInDto.getEmail());
        customer.setFN(customerInDto.getFN());
        customer.setLN(customerInDto.getLN());
        customer.setPassword(customerInDto.getPassword());
        customer.setUsername(customerInDto.getUsername());
        return customer;
    }
}
