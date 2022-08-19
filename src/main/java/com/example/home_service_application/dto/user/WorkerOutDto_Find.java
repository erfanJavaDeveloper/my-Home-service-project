package com.example.home_service_application.dto.user;

import com.example.home_service_application.entity.users.Worker;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WorkerOutDto_Find {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String address;

    public static WorkerOutDto_Find convertEntityToAdminOutDto_Find(Worker worker){
        WorkerOutDto_Find workerOutDto_find = new WorkerOutDto_Find();
        workerOutDto_find.setEmail(worker.getEmail());
        workerOutDto_find.setAddress(worker.getAddress());
        workerOutDto_find.setFirstName(worker.getFirstName());
        workerOutDto_find.setLastName(worker.getLastName());
        workerOutDto_find.setUsername(worker.getUsername());
        workerOutDto_find.setPassword(worker.getPassword());
        return workerOutDto_find;
    }
}
