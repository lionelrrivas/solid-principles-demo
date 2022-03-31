package com.lionelrivas.open_closed_principle;

public class BikingRoutePlanner implements RoutePlanner {

    @Override
    public String planRoute() {
        return "planned " + RouteType.BIKING.name() + " route";
    }
}
