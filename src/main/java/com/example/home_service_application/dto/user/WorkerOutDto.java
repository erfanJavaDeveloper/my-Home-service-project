package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Customer;
import com.example.home_service_application.entity.users.Worker;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkerOutDto {
    private Long id;

    public static WorkerOutDto convertEntityToOutDto(Worker worker){
        WorkerOutDto workerOutDto = new WorkerOutDto();
        workerOutDto.setId(worker.getId());
        return workerOutDto;
    }
}
