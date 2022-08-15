package com.example.home_service_application.repository.paying;

import com.example.home_service_application.entity.paying.Pay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayRepo extends JpaRepository<Pay,Long> {
}
