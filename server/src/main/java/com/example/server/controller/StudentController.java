package com.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public String getStudent() {
        return "Student endpoint";
    }

    @GetMapping(/allStudents)
    public String getAllStudents() {
        return "All students endpoint";
    }
}
