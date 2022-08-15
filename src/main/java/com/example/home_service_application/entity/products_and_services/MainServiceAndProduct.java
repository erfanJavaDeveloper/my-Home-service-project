package com.example.home_service_application.entity.products_and_services;

import com.example.home_service_application.entity.core.BaseService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class MainServiceAndProduct extends BaseService {
    @OneToMany(mappedBy = "mainServiceAndProduct")
    private List<SubServiceAndProduct> subServiceProduct = new ArrayList<>();
}
