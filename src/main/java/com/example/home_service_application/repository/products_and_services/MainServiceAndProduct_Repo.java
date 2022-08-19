package com.example.home_service_application.repository.products_and_services;

import com.example.home_service_application.entity.products_and_services.MainServiceAndProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MainServiceAndProduct_Repo extends JpaRepository<MainServiceAndProduct,Long> {
    @Modifying
    @Query(value = "update SubServiceAndProduct sap set sap.name=:name where sap.id=:id")
    void updateName(String name, Long id);
}
