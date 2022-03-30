package com.lionelrivas.singleresponsibility;

import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationServiceAntiPattern {

    public Student registerStudent(Student student) {

        // get db connection (platform dependent)
        // deal with validation logic
        // deal with connection problems, exceptions
        return new Student();
    }

    public void sendEmail(EmailMessage emailMessage) {
        // deal with validation logic
        // exposes communication method
        // deal with connection problems, exceptions
    }

//    public Student save(Student student) {
//        return new Student();
//    }

}
