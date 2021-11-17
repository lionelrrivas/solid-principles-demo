package com.lionelrivas.o;


import ch.qos.logback.classic.sift.AppenderFactoryUsingJoran;
import org.springframework.stereotype.Service;

@Service
public class NavigatorServiceAntiPattern {

    public String planRoute(String routeType) {

        switch (routeType) {
            case "WALKING":
                return "planned walking route";
            case "BIKING":
                return "planned biking route";
            case "DRIVING":
                return "planned driving route";
            case "PUBLIC_TRANSPORT":
                return "planned public transport route";
            default:
                return "no route found";
        }
    }
}
