package com.lionelrivas.o;

public class WalkingRoutePlanner implements RoutePlannerStrategy {

    @Override
    public String planRoute() {
        return "planned " + RouteType.WALKING.name() + " route";
    }
}
