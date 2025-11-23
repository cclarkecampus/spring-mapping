package com.example.jpa_mapping.data;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courseList;


}
