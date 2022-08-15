package com.example.home_service_application.Service.products_and_Services;

import com.example.home_service_application.Service.paying.ShoppingCartProducts_Service;
import com.example.home_service_application.Service.users.WorkerService;
import com.example.home_service_application.dto.products_and_services.MainServiceAndProductInDto;
import com.example.home_service_application.dto.products_and_services.SubServiceAndProductInDto;
import com.example.home_service_application.entity.products_and_services.MainServiceAndProduct;
import com.example.home_service_application.entity.products_and_services.SubServiceAndProduct;
import com.example.home_service_application.repository.products_and_services.SubServiceAndProduct_Repo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubServiceAndProduct_Service {

    private final SubServiceAndProduct_Repo subServiceAndProduct_repo;
    private final WorkerService workerService;
    private final MainServiceAndProduct_Service ms;
    private final ShoppingCartProducts_Service sps;

    @Transactional
    public SubServiceAndProduct saveWithDto(SubServiceAndProductInDto subServiceAndProductInDto) {
//        return subServiceAndProduct_repo.save( SubServiceAndProductInDto.convertInDtoToEntity(subServiceAndProductInDto));
        return subServiceAndProduct_repo.save(convertInDtoToEntity(subServiceAndProductInDto));
    }

    @Transactional
    public void delete(Long id) {
        if (findById(id)!=null){
//            if ()
            subServiceAndProduct_repo.delete(findById(id));
        }
    }

    @Transactional
    public SubServiceAndProduct findById(Long id) {
        return subServiceAndProduct_repo.findById(id).get();
    }

    public  SubServiceAndProduct convertInDtoToEntity(SubServiceAndProductInDto subServiceAndProductInDto){
        SubServiceAndProduct subServiceAndProduct = new SubServiceAndProduct();

        subServiceAndProduct.setName(subServiceAndProductInDto.getName());

        for (Long workersNumber: subServiceAndProductInDto.getWorkersNumber() ) {
            subServiceAndProduct.setWorker(List.of(workerService.findById(workersNumber)));
        }

        subServiceAndProduct.setMainServiceAndProduct(ms.findById(subServiceAndProductInDto.getMainServiceAndProduct()));

        subServiceAndProduct.setShoppingCartProducts(sps.findById(subServiceAndProductInDto.getShoppingCartProducts()));
        return subServiceAndProduct;
    }

}
