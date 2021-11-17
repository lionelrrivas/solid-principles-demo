package com.lionelrivas.o;

public class PublicTransportationRoutePlanner implements RoutePlannerStrategy {

    @Override
    public String planRoute() {
        return "planned " + RouteType.PUBLIC_TRANSPORT.name() + " route";
    }
}
