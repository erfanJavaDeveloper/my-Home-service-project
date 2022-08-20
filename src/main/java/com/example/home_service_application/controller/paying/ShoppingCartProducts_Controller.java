package com.example.home_service_application.controller.paying;


import com.example.home_service_application.Service.paying.ShoppingCartProducts_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("")
public class ShoppingCartProducts_Controller {
    private final ShoppingCartProducts_Service shoppingCartProducts_service;

}
