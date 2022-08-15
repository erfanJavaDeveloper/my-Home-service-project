package com.example.home_service_application.dto.paying;

import com.example.home_service_application.entity.paying.ResultOfPay;
import com.example.home_service_application.entity.paying.WayPaying;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@Getter
@Setter
public class PayInDto {
    @Enumerated(EnumType.STRING)
    private WayPaying wayPaying;
    @Enumerated(EnumType.STRING)
    private ResultOfPay resultOfPay;

}
