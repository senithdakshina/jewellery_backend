package com.jewellery.auth.auth_service.exeption;

public class UserNotFondException extends RuntimeException{
    public UserNotFondException(Long id){
        super("could not found user with id "+ id);
    }
}
