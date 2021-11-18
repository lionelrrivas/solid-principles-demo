package com.lionelrivas.l;

public class Eagle implements Bird {
    @Override
    public void flapWings() {
        System.out.println("Eagle flapping wings... creating a dust storm!");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flying... Look! A rabbit!");
    }
}
