package com.example.home_service_application.repository.paying;

import com.example.home_service_application.entity.paying.ShoppingCartProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartProductsRepo extends JpaRepository<ShoppingCartProducts,Long> {

}
