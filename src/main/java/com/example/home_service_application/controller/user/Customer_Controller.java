package com.example.home_service_application.controller.user;

import com.example.home_service_application.Service.users.CustomerService;
import com.example.home_service_application.dto.user.*;
import com.example.home_service_application.entity.users.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user/customer")
public class Customer_Controller {
    private final CustomerService customerService;

    @PostMapping("/")
    public ResponseEntity<String> save(@Valid @RequestBody CustomerInDto customerInDto) {

        Customer customer = customerService.saveWithDto(customerInDto);
        CustomerOutDto customerOutDto = CustomerOutDto.convertEntityToOutDto(customer);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(customerOutDto.getId() + " saved to database");

    }

    //    public ResponseEntity<String> delete(@Valid @RequestParam Long id, @PathVariable String id) {
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        customerService.delete(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(id + " deleted");
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<CustomerOutDto_Find> findById(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        CustomerOutDto_Find customerOutDto_find = CustomerOutDto_Find.convertEntityToAdminOutDto_Find(customer);
        return ResponseEntity.status(HttpStatus.FOUND)
                .body(customerOutDto_find);
    }

    @PutMapping("/updateAll/{id}")
    public ResponseEntity<String> updateAll(@Valid @RequestBody CustomerInDto customerInDto, @PathVariable Long id) {
        customerService.updateAll(customerInDto, id);
        return ResponseEntity.status(HttpStatus.UPGRADE_REQUIRED)
                .body(id + " upgraded");
    }

}
