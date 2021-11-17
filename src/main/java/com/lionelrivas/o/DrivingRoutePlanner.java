package com.lionelrivas.o;

public class DrivingRoutePlanner implements RoutePlannerStrategy {


    @Override
    public String planRoute() {
        return "planned " + RouteType.DRIVING.name() + " route";
    }
}
