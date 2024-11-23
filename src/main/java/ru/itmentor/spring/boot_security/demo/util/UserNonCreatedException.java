package ru.itmentor.spring.boot_security.demo.util;

public class UserNonCreatedException extends RuntimeException {
    public UserNonCreatedException(String msg) {
        super(msg);
    }
}
