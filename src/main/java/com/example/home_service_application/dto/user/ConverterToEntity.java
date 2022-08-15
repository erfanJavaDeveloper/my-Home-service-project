package com.example.home_service_application.dto.user;

public interface ConverterToEntity<T,E> {
    E convertInDtoToEntity(T t);
}
