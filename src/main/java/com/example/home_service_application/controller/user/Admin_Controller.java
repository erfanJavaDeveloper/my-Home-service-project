package com.example.home_service_application.controller.user;

import com.example.home_service_application.Service.users.AdminService;
import com.example.home_service_application.dto.user.AdminInDto;
import com.example.home_service_application.dto.user.AdminOutDto;
import com.example.home_service_application.dto.user.AdminOutDto_Find;
import com.example.home_service_application.entity.users.Admin;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user/admin")
public class Admin_Controller {
    private final AdminService adminService;

    @PostMapping("/")
    public ResponseEntity<String> save(@Valid @RequestBody AdminInDto adminInDto) {

        Admin admin = adminService.saveWithDto(adminInDto);
        AdminOutDto adminOutDto = AdminOutDto.convertEntityToOutDto(admin);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(adminOutDto.getId() + " saved to database");

    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        adminService.delete(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(id + " deleted" );
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<AdminOutDto_Find> findById(@PathVariable Long id){
        Admin admin = adminService.findById(id);
        AdminOutDto_Find adminOutDto_find = AdminOutDto_Find.convertEntityToAdminOutDto_Find(admin);
        return ResponseEntity.status(HttpStatus.FOUND)
                .body(adminOutDto_find);
    }

    @PutMapping("/updateAll/{id}")
    public ResponseEntity<String> updateAll( @PathVariable Long id , @Valid @RequestBody AdminInDto adminInDto){
        adminService.updateAll(adminInDto, id);
        return ResponseEntity.status(HttpStatus.UPGRADE_REQUIRED)
                .body(id+" upgraded");
    }
}
