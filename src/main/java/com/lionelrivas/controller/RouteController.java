package com.lionelrivas.controller;

import com.lionelrivas.o.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/routes")
public class RouteController {

    private final NavigationService navigationService;

    @Autowired
    public RouteController(NavigationService navigationService) {
        this.navigationService = navigationService;
    }

    @GetMapping(path = "/{routeType}", produces = {MediaType.TEXT_PLAIN_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String planRoute(@PathVariable String routeType) {
        return navigationService.planRoute(routeType);
    }
}
