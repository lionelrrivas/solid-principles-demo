package com.lionelrivas.o;

public class PublicTransportationRoutePlanner implements RoutePlanner {

    @Override
    public String planRoute() {
        return "planned " + RouteType.PUBLIC_TRANSPORT.name() + " route";
    }
}
