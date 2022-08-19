package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Worker;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
@Setter
@Getter
//public class WorkerInDto implements ConverterToEntity<WorkerInDto, Worker> {
public class WorkerInDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    @Email
    private String email;
    private String address;

    public static Worker convertInDtoToEntity(WorkerInDto workerInDto) {
        Worker worker = new Worker();
        worker.setAddress(workerInDto.getAddress());
        worker.setEmail(workerInDto.getEmail());
        worker.setFirstName(workerInDto.getFirstName());
        worker.setLastName(workerInDto.getLastName());
        worker.setPassword(workerInDto.getPassword());
        worker.setUsername(workerInDto.getUsername());
        return worker;
    }
}
