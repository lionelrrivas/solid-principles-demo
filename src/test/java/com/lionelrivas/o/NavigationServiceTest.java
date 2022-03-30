package com.lionelrivas.o;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NavigationServiceTest {

    @Test
    void planRoute() {

        NavigationService navigationService = new NavigationService();
        assertEquals(navigationService.planRoute("walking"), "planned WALKING route");
        assertEquals(navigationService.planRoute("biking"), "planned BIKING route");
        assertEquals(navigationService.planRoute("driving"), "planned DRIVING route");
        assertEquals(navigationService.planRoute("public-transport"), "planned PUBLIC_TRANSPORT route");
    }
}