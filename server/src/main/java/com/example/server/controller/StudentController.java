package com.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    /**
     * Returns the String "Student endpoint" when the default page is loaded.
     * @return "Student endpoint" statement
     */
    @GetMapping("/")
    public String getStudent() {
        return "Student endpoint";
    }

    /**
     * Returns "All students endpoint" after navigating to allStudents endpoint.
     * @return "All students endpoint" statement
     */
    @GetMapping("/allStudents")
    public String getAllStudents() {
        return "All students endpoint";
    }

    /**
     * Returns "Jessie Jiang" String after navigating to getName endpoint.
     * @return "Jessie Jiang" statement
     */
    @GetMapping("/getName")
    public String getName() {
        return "Jessie Jiang";
    }
}
