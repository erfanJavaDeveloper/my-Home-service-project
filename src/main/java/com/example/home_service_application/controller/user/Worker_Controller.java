package com.example.home_service_application.controller.user;

import com.example.home_service_application.Service.users.WorkerService;
import com.example.home_service_application.dto.user.*;
import com.example.home_service_application.entity.users.Worker;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user/worker")
public class Worker_Controller {
    private final WorkerService workerService;


    @PostMapping("/")
    public ResponseEntity<String> save(@Valid @RequestBody WorkerInDto workerInDto) {

        Worker worker = workerService.saveWithDto(workerInDto);
        WorkerOutDto workerOutDto = WorkerOutDto.convertEntityToOutDto(worker);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(workerOutDto.getId() + " saved to database");

    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        workerService.delete(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(id + " deleted" );
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<WorkerOutDto_Find> findById(@PathVariable Long id){
        Worker worker = workerService.findById(id);
        WorkerOutDto_Find workerOutDto_find = WorkerOutDto_Find.convertEntityToAdminOutDto_Find(worker);
        return ResponseEntity.status(HttpStatus.FOUND)
                .body(workerOutDto_find);
    }

    @PutMapping("/updateAll/{id}")
    public ResponseEntity<String> updateAll(@Valid @RequestBody WorkerInDto workerInDto,@PathVariable Long id){
        workerService.updateAll(workerInDto, id);
        return ResponseEntity.status(HttpStatus.UPGRADE_REQUIRED)
                .body(id+" upgraded");
    }
}
