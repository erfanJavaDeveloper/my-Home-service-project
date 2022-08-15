package com.example.home_service_application.repository.paying;

import com.example.home_service_application.entity.paying.DiscountCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountCodeRepo extends JpaRepository<DiscountCode,Long> {
}
