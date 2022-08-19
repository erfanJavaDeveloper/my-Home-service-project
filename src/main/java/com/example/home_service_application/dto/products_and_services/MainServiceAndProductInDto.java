package com.example.home_service_application.dto.products_and_services;

import com.example.home_service_application.Service.products_and_Services.SubServiceAndProduct_Service;
import com.example.home_service_application.entity.products_and_services.MainServiceAndProduct;
import lombok.*;


import java.util.List;

@Getter
@Setter
//@AllArgsConstructor
@RequiredArgsConstructor
public class MainServiceAndProductInDto {
    private final SubServiceAndProduct_Service subServiceAndProduct_service;
    private String name;
    private List<Long> subServiceProduct ;


    public  MainServiceAndProduct convertInDtoToEntity(MainServiceAndProductInDto mainServiceAndProductInDto) {
        MainServiceAndProduct mainServiceAndProduct = new MainServiceAndProduct();

        mainServiceAndProduct.setName(mainServiceAndProductInDto.getName());

        mainServiceAndProduct.setName(mainServiceAndProductInDto.getName());
        for (Long subServiceAndProductsID : mainServiceAndProductInDto.getSubServiceProduct()) {
            mainServiceAndProduct.setSubServiceProduct(List.of(subServiceAndProduct_service.findById(subServiceAndProductsID)));
        }

        return mainServiceAndProduct;
    }
}
