package com.example.home_service_application.entity.paying;

import com.example.home_service_application.entity.core.BasePay;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Pay extends BasePay {

    @OneToOne
    private ShoppingCartProducts shoppingCartProducts;
    @Enumerated
    private WayPaying wayPaying;
    @Enumerated
    private ResultOfPay resultOfPay;

}
