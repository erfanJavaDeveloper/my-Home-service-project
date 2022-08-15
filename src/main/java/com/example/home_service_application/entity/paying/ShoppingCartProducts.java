package com.example.home_service_application.entity.paying;

import com.example.home_service_application.entity.core.BasePay;
import com.example.home_service_application.entity.products_and_services.SubServiceAndProduct;
import com.example.home_service_application.entity.users.Customer;
import com.example.home_service_application.entity.users.Worker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ShoppingCartProducts extends BasePay {
    @OneToOne
    private Customer customer;
    @OneToMany(mappedBy = "shoppingCartProducts")
    private List<SubServiceAndProduct> subServiceAndProduct;

    private BigDecimal totalPrice;

    private String discountCodeOfCustomer;


}
