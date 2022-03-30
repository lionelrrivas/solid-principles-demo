package com.lionelrivas.singleresponsibility;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {StudentRegistrationService.class, StudentRepository.class, EmailService.class})
class StudentRegistrationServiceTest {

    @Autowired
    StudentRegistrationService studentRegistrationService;

    // these dependencies should be mocked
//    @MockBean
//    StudentRepository studentRepository;
//
//    @MockBean
//    EmailService emailService;

    @Test
    void registerStudent() {
        assertNotNull(studentRegistrationService.registerStudent(new Student()));
    }

}