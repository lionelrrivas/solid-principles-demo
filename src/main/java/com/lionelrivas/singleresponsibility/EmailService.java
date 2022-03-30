package com.lionelrivas.singleresponsibility;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendEmail(EmailMessage emailMessage) {
        System.out.println("sending email message" + emailMessage);
    }
}
