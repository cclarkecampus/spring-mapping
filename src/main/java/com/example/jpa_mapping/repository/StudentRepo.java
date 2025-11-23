package com.example.jpa_mapping.repository;

import com.example.jpa_mapping.data.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
