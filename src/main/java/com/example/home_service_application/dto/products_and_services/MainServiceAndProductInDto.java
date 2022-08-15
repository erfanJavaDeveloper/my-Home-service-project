package com.example.home_service_application.dto.products_and_services;

import com.example.home_service_application.Service.products_and_Services.SubServiceAndProduct_Service;
import com.example.home_service_application.entity.products_and_services.MainServiceAndProduct;
import lombok.*;


import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class MainServiceAndProductInDto {
    private final SubServiceAndProduct_Service subServiceAndProduct_service;
    private String name;
    private List<Long> subServiceProduct ;


}
