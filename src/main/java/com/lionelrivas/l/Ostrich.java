package com.lionelrivas.l;

public class Ostrich implements Bird {

    @Override
    public void flapWings() {
        System.out.println("ostrich flapping wings");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
