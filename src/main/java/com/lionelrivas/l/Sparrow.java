package com.lionelrivas.l;

public class Sparrow implements FlyingBird, WingFlappingBird {

    @Override
    public void flapWings() {
        System.out.println("Sparrow flapping wings");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
}
