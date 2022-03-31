package com.lionelrivas.open_closed_principle;

import com.lionelrivas.exception.RouteNotFoundException;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum RouteType {

    WALKING("WALKING") {
        @Override
        RoutePlanner getStrategy() {
            return new WalkingRoutePlanner();
        }
    },

    DRIVING("DRIVING") {

        @Override
        RoutePlanner getStrategy() {
            return new DrivingRoutePlanner();
        }
    },

    PUBLIC_TRANSPORT("PUBLIC-TRANSPORT") {
        @Override
        RoutePlanner getStrategy() {
            return new PublicTransportationRoutePlanner();
        }
    },

    BIKING("BIKING") {
        @Override
        RoutePlanner getStrategy() {
            return new BikingRoutePlanner();
        }
    };

    private final String code;

    private static final Map<String, RouteType> ROUTE_TYPE_MAP;

    RouteType(String code) {
        this.code = code;
    }
    static {
        ROUTE_TYPE_MAP = Arrays.stream(values()).collect(Collectors.toMap(routeType -> routeType.code, Function.identity()));
    }

    public static RouteType getRouteType(String routeType) {
        if (StringUtils.isEmpty(routeType) || ROUTE_TYPE_MAP.get(routeType.toUpperCase()) == null) {
            throw new RouteNotFoundException("Unable to find route strategy for " + routeType);
        }
        return ROUTE_TYPE_MAP.get(routeType.toUpperCase());
    }

    abstract RoutePlanner getStrategy();
}
