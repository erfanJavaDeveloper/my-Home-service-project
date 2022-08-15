package com.example.home_service_application.repository.products_and_services;

import com.example.home_service_application.entity.products_and_services.MainServiceAndProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainServiceAndProduct_Repo extends JpaRepository<MainServiceAndProduct,Long> {
}
