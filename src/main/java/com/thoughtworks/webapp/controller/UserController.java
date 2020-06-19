package com.thoughtworks.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user/1")
    public String getName() {
        return "zx";
    }
}
