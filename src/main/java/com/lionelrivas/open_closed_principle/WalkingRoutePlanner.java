package com.lionelrivas.open_closed_principle;

public class WalkingRoutePlanner implements RoutePlanner {

    @Override
    public String planRoute() {
        return "planned " + RouteType.WALKING.name() + " route";
    }
}
