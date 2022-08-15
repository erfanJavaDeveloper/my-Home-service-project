package com.example.home_service_application.dto.products_and_services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SubServiceAndProductInDto {


    private List<Long> workersNumber = new ArrayList<>();
    private Long mainServiceAndProduct;
    private Long shoppingCartProducts;
    private String name;
    private BigDecimal price;
    private String description;


}
