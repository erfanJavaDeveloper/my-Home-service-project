package com.example.home_service_application.Service.products_and_Services;

import com.example.home_service_application.dto.products_and_services.MainServiceAndProductInDto;
import com.example.home_service_application.dto.products_and_services.MainServiceAndProductInDto_Update;
import com.example.home_service_application.entity.products_and_services.MainServiceAndProduct;
import com.example.home_service_application.repository.products_and_services.MainServiceAndProduct_Repo;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainServiceAndProduct_Service {

    private final MainServiceAndProduct_Repo mainServiceAndProduct_repo;
//    @Lazy
//    private final SubServiceAndProduct_Service subServiceAndProduct_service;

    @Transactional
    public MainServiceAndProduct saveWithDto(MainServiceAndProductInDto mainServiceAndProductInDto) {
        return mainServiceAndProduct_repo.save(convertInDtoToEntity(mainServiceAndProductInDto));
    }

    @Transactional
    public void delete(Long id) {
        if (findById(id)!=null){
//            if ()
            mainServiceAndProduct_repo.delete(findById(id));
        }
    }

    @Transactional
    public MainServiceAndProduct findById(Long id) {
        return mainServiceAndProduct_repo.findById(id).get();
    }

    @Transactional
    public void updateName(MainServiceAndProductInDto_Update mainServiceAndProductInDto_update ,Long id){
        mainServiceAndProduct_repo.updateName(mainServiceAndProductInDto_update.getName(),id);
    }


    @Transactional
    public  MainServiceAndProduct convertInDtoToEntity(MainServiceAndProductInDto mainServiceAndProductInDto) {
      return mainServiceAndProductInDto.convertInDtoToEntity(mainServiceAndProductInDto);
    }


}
