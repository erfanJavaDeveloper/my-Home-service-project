package com.example.home_service_application.entity.paying;

import com.example.home_service_application.entity.core.BasePay;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class DiscountCode extends BasePay {
    private String Code;
}
