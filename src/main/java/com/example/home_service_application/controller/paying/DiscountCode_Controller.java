package com.example.home_service_application.controller.paying;

import com.example.home_service_application.Service.paying.DiscountCode_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("")
public class DiscountCode_Controller{
    private final DiscountCode_Service discountCode_service;

}
