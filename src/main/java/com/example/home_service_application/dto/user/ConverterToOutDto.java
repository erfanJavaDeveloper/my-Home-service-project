package com.example.home_service_application.dto.user;

public interface ConverterToOutDto<E,D> {
    D convertEntityToOutDto(E e);
}
