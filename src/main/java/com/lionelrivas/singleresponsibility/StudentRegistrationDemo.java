package com.lionelrivas.singleresponsibility;

import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationDemo {

    private StudentRegistrationService service;

    public StudentRegistrationDemo(StudentRegistrationService service) {
        this.service = service;
    }

    public Student registerStudent(Student student) {
        return service.registerStudent(student);
    }
}
