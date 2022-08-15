package com.example.home_service_application.entity.products_and_services;

import com.example.home_service_application.entity.core.BaseService;
import com.example.home_service_application.entity.paying.ShoppingCartProducts;
import com.example.home_service_application.entity.users.Worker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SubServiceAndProduct extends BaseService {

    @ManyToOne(cascade = CascadeType.ALL)
    private MainServiceAndProduct mainServiceAndProduct;
    @ManyToMany(mappedBy = "subServiceAndProduct")
    private List<Worker> worker=new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL)
    private ShoppingCartProducts shoppingCartProducts;

    private BigDecimal price;

    private String description;
}
