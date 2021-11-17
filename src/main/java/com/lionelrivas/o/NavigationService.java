package com.lionelrivas.o;

import org.springframework.stereotype.Service;

@Service
public class NavigationService {

    public String planRoute(String routeType) {
        return RouteType.getRouteType(routeType).getStrategy().planRoute();
    }

}
