package com.lionelrivas.s;

import org.springframework.stereotype.Service;

@Service
public class StudentRepository {

    public Student save(Student student) {
        return student;
    }
 }
