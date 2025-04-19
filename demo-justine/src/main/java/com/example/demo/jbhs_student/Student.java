package com.example.demo.jbhs_student;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "juniorhigh_table")
public class Student {
    
    //FORMAT COPY
    private String _jhs;
    
    // ID-TEMPID KENEME
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_jhs;
    @Column(nullable = false, unique = true)
    private String studentNumber_jhs;
    @Column(nullable = false)
    private String status_jhs;

    // I. PERSONAL DATA 
    @Column(nullable = false)
    private String firstName_jhs;
    @Column(nullable = false)
    private String lastName_jhs;
    private String middleName_jhs;
    private String _jhs;
    
