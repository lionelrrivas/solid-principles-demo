package com.lionelrivas.open_closed_principle;

public class DrivingRoutePlanner implements RoutePlanner {


    @Override
    public String planRoute() {
        return "planned " + RouteType.DRIVING.name() + " route";
    }
}
