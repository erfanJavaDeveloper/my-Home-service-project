package com.example.home_service_application.exception.http;

import com.example.instagramforvistawithspringboot.data.controller.template.ResponseTemplate;
import com.example.instagramforvistawithspringboot.exception.comment.CommentNullFoundException;
import com.example.instagramforvistawithspringboot.exception.post.PostNotFound;
import com.example.instagramforvistawithspringboot.exception.user.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class ExceptionHandlerAdvice {


    @ExceptionHandler(value = {FileNotFoundException.class})
    public ResponseEntity<ResponseTemplate> notFound() {

        ResponseTemplate response = ResponseTemplate.builder()
                .code(HttpStatus.NOT_FOUND.value())
                .message("I can not found   --> NotFoundException() ")
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

//    @ExceptionHandler(value = UserIsRepetitious.class)
//    public ResponseEntity<ResponseTemplate> userIsRepetitious() {
//        ResponseTemplate response = ResponseTemplate.builder()
//                .code(HttpStatus.BAD_REQUEST.value())
//                .message("userName is Repetitious")
//                .build();
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
//    }
    @ExceptionHandler(value = UserNameIsInDb.class)
    public ResponseEntity<ResponseTemplate> userIsRepetitious() {
        ResponseTemplate response = ResponseTemplate.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message("userName is Repetitious")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(value = UsersAreSimilar.class)
    public ResponseEntity<ResponseTemplate> usersAreSimilar() {
        ResponseTemplate response = ResponseTemplate.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message("users are similar")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseTemplate> methodArgumentNotValidException() {
        ResponseTemplate response = ResponseTemplate.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message(" The 'name' and 'lastName' must start with a capital letter and " +
                        " the first and last name must have at least 3 characters ")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

//    @ExceptionHandler(value = DataIntegrityViolationException.class)
//    public ResponseEntity<ResponseTemplate> dataIntegrityViolationException() {
//        ResponseTemplate response = ResponseTemplate.builder()
//                .code(HttpStatus.BAD_REQUEST.value())
//                .message("Duplicate entity ::::::>>  there is all information of input user in DB " +
//                        "so if you login pleas input you account ;)")
//                .build();
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
//
//    }

    @ExceptionHandler(value = UserIsRepetitious.class)
    public ResponseEntity<ResponseTemplate> dataIntegrityViolationException() {
        ResponseTemplate response = ResponseTemplate.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message("Duplicate entity ::::::>>  there is all information of input user in DB " +
                        "so if you login pleas input you account ;)")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

    }

    @ExceptionHandler(value = NoSuchElementException.class)
    public ResponseEntity<ResponseTemplate> noSuchElementException() {
        ResponseTemplate response = ResponseTemplate.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message("follower or following is null")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

    }

    @ExceptionHandler(value = UserIsNullException.class)
    public ResponseEntity<ResponseTemplate> userIsNullException() {
        ResponseTemplate response = ResponseTemplate.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message("there is not any user with input id so is null")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

    }

    @ExceptionHandler(value = PostNotFound.class)
    public ResponseEntity<ResponseTemplate> postNotFound() {
        ResponseTemplate response = ResponseTemplate.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message("there is not any post with input id")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

    }

    @ExceptionHandler(value = NullFoundException.class)
    public ResponseEntity<ResponseTemplate> nullFoundException() {
        ResponseTemplate response = ResponseTemplate.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message("there is not any 'user' with your input ")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

    }

    @ExceptionHandler(value = CommentNullFoundException.class)
    public ResponseEntity<ResponseTemplate> commentNullFoundException() {
        ResponseTemplate response = ResponseTemplate.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message("there is not any comment with input id ")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

    }


}
