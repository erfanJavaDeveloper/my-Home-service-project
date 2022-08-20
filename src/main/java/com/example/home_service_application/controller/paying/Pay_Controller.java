package com.example.home_service_application.controller.paying;

import com.example.home_service_application.Service.paying.Pay_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("")
public class Pay_Controller {
    private final Pay_Service pay_service ;


}
