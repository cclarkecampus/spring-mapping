package com.example.jpa_mapping.service;

import com.example.jpa_mapping.data.Student;
import com.example.jpa_mapping.repository.StudentRepo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Resource
    private StudentRepo studentRepo;


    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

}
