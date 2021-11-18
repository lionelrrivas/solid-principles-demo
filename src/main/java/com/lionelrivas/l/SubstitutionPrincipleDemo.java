package com.lionelrivas.l;

import java.util.Arrays;

public class SubstitutionPrincipleDemo {
    public void demonstratePrinciple() {
        Bird sparrow = new Sparrow();
        Bird eagle = new Eagle();
//        Bird ostrich = new Ostrich();

        Arrays.asList(sparrow, eagle).forEach(bird -> {
            bird.flapWings();
            bird.fly();
        });
    }
}
