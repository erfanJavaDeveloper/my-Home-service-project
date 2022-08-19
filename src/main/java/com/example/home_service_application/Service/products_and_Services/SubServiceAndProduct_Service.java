package com.example.home_service_application.Service.products_and_Services;

import com.example.home_service_application.dto.products_and_services.SubServiceAndProductInDto;
import com.example.home_service_application.dto.products_and_services.SubServiceAndProductInDto_Update;
import com.example.home_service_application.entity.products_and_services.SubServiceAndProduct;
import com.example.home_service_application.repository.products_and_services.SubServiceAndProduct_Repo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class SubServiceAndProduct_Service {

    private final SubServiceAndProduct_Repo subServiceAndProduct_repo;
//    private final WorkerService workerService;
//    private final MainServiceAndProduct_Service ms;
//    private final ShoppingCartProducts_Service sps;
//    private final SubServiceAndProductInDto subServiceAndProductInDto;

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

//    @Transactional
    public  SubServiceAndProduct convertInDtoToEntity(SubServiceAndProductInDto subServiceAndProductInDto){
     return subServiceAndProductInDto.convertInDtoToEntity(subServiceAndProductInDto);
    }

    @Transactional
    public void updateName(SubServiceAndProductInDto_Update subServiceAndProductInDto_update,Long id){
        subServiceAndProduct_repo.updateName(subServiceAndProductInDto_update.getName(),id);
    }
}
