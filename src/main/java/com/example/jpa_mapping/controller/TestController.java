package com.example.jpa_mapping.controller;

import com.example.jpa_mapping.data.Student;
import com.example.jpa_mapping.repository.StudentRepo;
import com.example.jpa_mapping.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private final StudentService studentService;

    public TestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String testAPI() {
        return "Hello SPRING";
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return studentService.getAllStudents();
    }
}
