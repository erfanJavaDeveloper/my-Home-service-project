package com.example.home_service_application.controller.products_and_services;

import com.example.home_service_application.Service.products_and_Services.SubServiceAndProduct_Service;
import com.example.home_service_application.dto.products_and_services.SubServiceAndProductInDto;
import com.example.home_service_application.entity.products_and_services.SubServiceAndProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/SubServiceAndProduct")
public class SubServiceAndProduct_Controller {
    private final SubServiceAndProduct_Service subServiceAndProduct_service;

    @PostMapping("/")
    public ResponseEntity<String> save(@RequestBody SubServiceAndProductInDto subServiceAndProductInDto) {
        SubServiceAndProduct subServiceAndProduct = subServiceAndProduct_service.saveWithDto(subServiceAndProductInDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(subServiceAndProduct + "  /n created");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        subServiceAndProduct_service.delete(id);

        return ResponseEntity.status(HttpStatus.OK)
                .body(id + " deleted from db");

    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<SubServiceAndProduct> findById(@PathVariable Long id){
        SubServiceAndProduct subServiceAndProduct = subServiceAndProduct_service.findById(id);
        return ResponseEntity.status(HttpStatus.FOUND)
                .body(subServiceAndProduct);
    }
}
