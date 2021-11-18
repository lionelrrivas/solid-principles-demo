package com.lionelrivas.o;

public class DrivingRoutePlanner implements RoutePlanner {


    @Override
    public String planRoute() {
        return "planned " + RouteType.DRIVING.name() + " route";
    }
}
