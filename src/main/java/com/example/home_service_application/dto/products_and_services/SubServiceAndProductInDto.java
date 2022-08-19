package com.example.home_service_application.dto.products_and_services;

import com.example.home_service_application.Service.paying.ShoppingCartProducts_Service;
import com.example.home_service_application.Service.products_and_Services.MainServiceAndProduct_Service;
import com.example.home_service_application.Service.users.WorkerService;
import com.example.home_service_application.entity.products_and_services.SubServiceAndProduct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class SubServiceAndProductInDto {
    private final WorkerService workerService;
    private final MainServiceAndProduct_Service ms;
    private final ShoppingCartProducts_Service sps;

//    private List<Long> workersNumber = new ArrayList<>();
//    private Long mainServiceAndProduct;
//    private Long shoppingCartProducts;
    private String name;
    private BigDecimal price;
    private String description;


    @Transactional
    public SubServiceAndProduct convertInDtoToEntity(SubServiceAndProductInDto subServiceAndProductInDto) {
        SubServiceAndProduct subServiceAndProduct = new SubServiceAndProduct();

        subServiceAndProduct.setName(subServiceAndProductInDto.getName());

        subServiceAndProduct.setDescription(subServiceAndProductInDto.getDescription());
        subServiceAndProduct.setPrice(subServiceAndProductInDto.getPrice());
//        for (Long workersNumber : subServiceAndProductInDto.getWorkersNumber()) {
//            subServiceAndProduct.setWorker(List.of(workerService.findById(workersNumber)));
//        }
//
//        subServiceAndProduct.setMainServiceAndProduct(ms.findById(subServiceAndProductInDto.getMainServiceAndProduct()));
//
//        subServiceAndProduct.setShoppingCartProducts(sps.findById(subServiceAndProductInDto.getShoppingCartProducts()));
        return subServiceAndProduct;
    }
}
