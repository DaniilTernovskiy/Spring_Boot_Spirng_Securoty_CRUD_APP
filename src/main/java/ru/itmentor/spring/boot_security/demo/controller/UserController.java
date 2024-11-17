package ru.itmentor.spring.boot_security.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    @GetMapping("/index")
    public String users() {
        return "index";
    }
}
