package com.example.home_service_application.Service.paying;

import com.example.home_service_application.entity.paying.ShoppingCartProducts;
import com.example.home_service_application.repository.paying.ShoppingCartProductsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ShoppingCartProducts_Service {
    private final ShoppingCartProductsRepo shoppingCartProductsRepo;

//    @Transactional
//    public MainServiceAndProduct saveWithDto(MainServiceAndProductInDto mainServiceAndProductInDto) {
////        return shoppingCartProductsRepo.save( MainServiceAndProductInDto.convertInDtoToEntity(mainServiceAndProductInDto));
//    }

    @Transactional
    public void delete(Long id) {
        if (findById(id)!=null){
//            if ()
            shoppingCartProductsRepo.delete(findById(id));
        }
    }

    @Transactional
    public ShoppingCartProducts findById(Long id) {
        return shoppingCartProductsRepo.findById(id).get();
    }



}
