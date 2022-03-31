package com.lionelrivas.open_closed_principle;

public class PublicTransportationRoutePlanner implements RoutePlanner {

    @Override
    public String planRoute() {
        return "planned " + RouteType.PUBLIC_TRANSPORT.name() + " route";
    }
}
