package com.example.home_service_application.controller;
//
//import com.example.mySpringBoot.Service.UserService;
//import com.example.mySpringBoot.dto.UserInDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
//    private final UserService userService;
//
//
//    @PostMapping("/")
//    public ResponseEntity<String> save(@RequestBody UserInDto userInDto) {
//        userService.saveWithDto(userInDto);
//
//        return ResponseEntity.status(HttpStatus.OK)
//                .body("user saved");
//    }


}
