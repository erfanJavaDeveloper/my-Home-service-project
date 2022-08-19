package com.example.home_service_application.Service.users;

import com.example.home_service_application.dto.user.AdminInDto;
import com.example.home_service_application.entity.users.Admin;
import com.example.home_service_application.repository.users.AdminRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminRepo adminRepo;

    @Transactional
    public Admin saveWithDto(AdminInDto adminInDto) {
        return adminRepo.save( adminInDto.convertInDtoToEntity(adminInDto));
    }

    @Transactional
    public void delete(Long id) {
        if (findById(id)!=null){
//            if ()
        adminRepo.delete(findById(id));
        }
    }

    @Transactional
    public Admin findById(Long id) {
        return adminRepo.findById(id).get();
    }

    @Transactional
    public void updateAll(AdminInDto adminInDto ,Long id) {
        adminRepo.updateALLInformation(adminInDto.getFirstName(), adminInDto.getLastName(),
                adminInDto.getUsername(), adminInDto.getPassword(), adminInDto.getAddress(),
                adminInDto.getEmail(), id);
    }


}
