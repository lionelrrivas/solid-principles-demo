package com.lionelrivas.o;

import com.lionelrivas.exception.RouteNotFoundException;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum RouteType {

    WALKING {
        @Override
        RoutePlannerStrategy getStrategy() {
            return new WalkingRoutePlanner();
        }
    },

    DRIVING {
        @Override
        RoutePlannerStrategy getStrategy() {
            return new DrivingRoutePlanner();
        }
    },

    PUBLIC_TRANSPORT {
        @Override
        RoutePlannerStrategy getStrategy() {
            return new PublicTransportationRoutePlanner();
        }
    },

    BIKING {
        @Override
        RoutePlannerStrategy getStrategy() {
            return new BikingRoutePlanner();
        }
    };

    private static final Map<String, RouteType> ROUTE_TYPE_MAP;

    static {
        ROUTE_TYPE_MAP = Arrays.stream(values()).collect(Collectors.toMap(Enum::name, Function.identity()));
    }

    public static RouteType getRouteType(String routeType) {
        if (StringUtils.isEmpty(routeType) || ROUTE_TYPE_MAP.get(routeType.toUpperCase()) == null) {
            throw new RouteNotFoundException("Unable to find route strategy for " + routeType);
        }
        return ROUTE_TYPE_MAP.get(routeType.toUpperCase());
    }

    abstract RoutePlannerStrategy getStrategy();
}
