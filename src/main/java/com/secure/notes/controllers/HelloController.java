package com.secure.notes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "Contact Page";
    }

    @GetMapping("/public/login")
    public String loginPage() {
        return "Login Page";
    }

    @GetMapping("/admin/dashboard")
    public String dashboardPage() {
        return "Dashboard Page";
    }
}
