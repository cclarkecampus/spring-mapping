package com.example.jpa_mapping.data;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "course")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String code;
}
