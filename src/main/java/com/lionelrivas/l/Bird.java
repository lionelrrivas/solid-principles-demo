package com.lionelrivas.l;

/*
This innocent looking interface is a typical violation of the Liskov's Substitution Principle.
The {@code fly()} method is not appropriate for all implementations of {@code Bird}
 */
public interface Bird {
    void flapWings();
    void fly();
}
