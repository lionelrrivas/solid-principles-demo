package com.lionelrivas.o;

public class BikingRoutePlanner implements RoutePlanner {

    @Override
    public String planRoute() {
        return "planned " + RouteType.BIKING.name() + " route";
    }
}
