package com.lionelrivas.o;

public class BikingRoutePlanner implements RoutePlannerStrategy {

    @Override
    public String planRoute() {
        return "planned " + RouteType.BIKING.name() + " route";
    }
}
