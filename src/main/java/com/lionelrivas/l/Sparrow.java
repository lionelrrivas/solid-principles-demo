package com.lionelrivas.l;

public class Sparrow implements Bird {

    @Override
    public void flapWings() {
        System.out.println("Sparrow flapping wings");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
}
