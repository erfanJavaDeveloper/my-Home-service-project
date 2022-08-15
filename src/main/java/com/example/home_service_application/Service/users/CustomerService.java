package com.example.home_service_application.Service.users;

import com.example.home_service_application.dto.user.CustomerInDto;
import com.example.home_service_application.entity.users.Customer;
import com.example.home_service_application.repository.users.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerService {
 private final CustomerRepo customerRepo;
    @Transactional
    public Customer saveWithDto(CustomerInDto customerInDto) {
        Customer customer = customerInDto.convertInDtoToEntity(customerInDto);
        return customerRepo.save(customer);
    }

    @Transactional
    public void delete(Long id) {
        customerRepo.delete(findById(id));
    }

    @Transactional
    public Customer findById(Long id) {
        return customerRepo.findById(id).get();
    }

    @Transactional
    public void updateAll(CustomerInDto customerInDto , Long id) {
        customerRepo.updateALLInformation(customerInDto.getFN(), customerInDto.getLN(),
                customerInDto.getUsername(), customerInDto.getPassword(), customerInDto.getAddress(),
                customerInDto.getEmail(), id);
    }
}
