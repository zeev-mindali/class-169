package com.johnbryce.catbackend.advice;

import com.johnbryce.catbackend.exceptions.CatSystemException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.security.auth.login.LoginException;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CatControllerAdvice {
    @ExceptionHandler(value = {CatSystemException.class,LoginException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrDetails handleError(Exception e){
        return new ErrDetails("Error",e.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> handleValidationExceptions(MethodArgumentNotValidException exception){
        Map<String,String> errors = new HashMap<>();
        exception.getBindingResult().getAllErrors().forEach((error)->{
            String fieldName = ((FieldError)error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName,errorMessage);
        });
        System.out.println(exception.getBindingResult().getAllErrors());
        return errors;
    }
//    @ExceptionHandler(value = LoginException.class)
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    public ErrDetails handeBadLogin(LoginException exception){
//        return new ErrDetails("Error",exception.getMessage());
//    }
}
