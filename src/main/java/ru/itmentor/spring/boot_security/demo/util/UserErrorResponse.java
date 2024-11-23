package ru.itmentor.spring.boot_security.demo.util;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserErrorResponse {
    private String message;

    public UserErrorResponse(String message) {
        this.message = message;
    }

}
