package com.lionelrivas.singleresponsibility;

import lombok.Data;

@Data
public class EmailMessage {

    private String subject;
    private String text;
    private Student recipient;
    private String sender;
}
