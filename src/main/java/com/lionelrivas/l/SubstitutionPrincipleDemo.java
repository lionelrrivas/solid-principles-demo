package com.lionelrivas.l;

import java.util.Arrays;

public class SubstitutionPrincipleDemo {

    public void demonstratePrinciple() {
        FlyingBird sparrow = new Sparrow();
        FlyingBird eagle = new Eagle();
        WingFlappingBird ostrich = new Ostrich();

        Arrays.asList(sparrow, eagle).forEach(FlyingBird::fly);
        ostrich.flapWings();
    }
}
