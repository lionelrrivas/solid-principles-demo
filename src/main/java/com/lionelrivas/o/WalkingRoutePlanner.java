package com.lionelrivas.o;

public class WalkingRoutePlanner implements RoutePlanner {

    @Override
    public String planRoute() {
        return "planned " + RouteType.WALKING.name() + " route";
    }
}
