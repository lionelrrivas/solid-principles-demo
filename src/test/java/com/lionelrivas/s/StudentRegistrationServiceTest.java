package com.lionelrivas.s;

import com.lionelrivas.d.ApplePayClient;
import com.lionelrivas.d.PayPalClient;
import com.lionelrivas.d.PaymentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

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