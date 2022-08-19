package com.example.home_service_application.controller.products_and_services;

import com.example.home_service_application.Service.products_and_Services.MainServiceAndProduct_Service;
import com.example.home_service_application.dto.products_and_services.MainServiceAndProductInDto;
import com.example.home_service_application.dto.products_and_services.MainServiceAndProductInDto_Update;
import com.example.home_service_application.entity.products_and_services.MainServiceAndProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/MainServiceAndProduct")
public class MainServiceAndProduct_Controller {
    private final MainServiceAndProduct_Service mainServiceAndProduct_service;
    @PostMapping("/")
    public ResponseEntity<String> save(@RequestBody MainServiceAndProductInDto mainServiceAndProductInDto) {
        MainServiceAndProduct mainServiceAndProduct = mainServiceAndProduct_service.saveWithDto(mainServiceAndProductInDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(mainServiceAndProduct + "  /n created");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        mainServiceAndProduct_service.delete(id);

        return ResponseEntity.status(HttpStatus.OK)
                .body(id + " deleted from db");

    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<MainServiceAndProduct> findById(@PathVariable Long id){
        MainServiceAndProduct mainServiceAndProduct = mainServiceAndProduct_service.findById(id);
        return ResponseEntity.status(HttpStatus.FOUND)
                .body(mainServiceAndProduct);
    }
    @PutMapping("/updateName/{id}")
    public ResponseEntity<String> updateName(@PathVariable Long id , @RequestBody MainServiceAndProductInDto_Update mainServiceAndProductInDto_update){
        mainServiceAndProduct_service.updateName(mainServiceAndProductInDto_update,id);
        return  ResponseEntity.status(HttpStatus.UPGRADE_REQUIRED)
                .body("updated");
    }
}
