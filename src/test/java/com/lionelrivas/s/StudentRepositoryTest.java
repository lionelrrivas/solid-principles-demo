package com.lionelrivas.s;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = {StudentRepository.class})
class StudentRepositoryTest {


    @Autowired
    StudentRepository studentRepository;

    @Test
    void save() {
        assertNotNull(studentRepository.save(new Student()));
    }
}