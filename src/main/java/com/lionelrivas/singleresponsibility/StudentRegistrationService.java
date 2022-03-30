package com.lionelrivas.singleresponsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentRegistrationService {

    private final StudentRepository studentRepository;
    private final EmailService emailService;

    @Autowired
    public StudentRegistrationService(StudentRepository studentRepository, EmailService emailService) {
        this.studentRepository = studentRepository;
        this.emailService = emailService;
    }

    public Student registerStudent(Student student) {
        Student registeredStudent = studentRepository.save(student);
        // if persisted successfully, else throw exception
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setRecipient(registeredStudent);
        emailService.sendEmail(emailMessage);

        return registeredStudent;
    }

}
