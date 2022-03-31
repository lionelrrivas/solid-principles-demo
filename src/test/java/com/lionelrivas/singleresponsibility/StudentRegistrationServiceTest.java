package com.lionelrivas.singleresponsibility;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentRegistrationServiceTest {

    @InjectMocks
    StudentRegistrationService studentRegistrationService;

    @Mock
    StudentRepository studentRepository;

    @Mock
    EmailService emailService;

    @Test
    void registerStudent_withValidInput_expectSuccessfulRegistration() {
        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setEmailAddress("johndoe@emailaddress.com");

        when(studentRepository.save(student)).thenReturn(student);
        doNothing().when(emailService).sendEmail(any());

        Student registeredStudent = studentRegistrationService.registerStudent(student);
        assertNotNull(registeredStudent);
        assertEquals(student, registeredStudent);
    }

}