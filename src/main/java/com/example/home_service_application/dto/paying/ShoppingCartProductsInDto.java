package com.example.home_service_application.dto.paying;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ShoppingCartProductsInDto {

    private BigDecimal totalPrice;

    private String discountCodeOfCustomer;
}
