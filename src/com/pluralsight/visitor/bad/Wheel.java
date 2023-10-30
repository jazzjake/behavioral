package com.pluralsight.visitor.bad;

public class Wheel implements AtvPart {

    @Override
    public double calculateShipping() {
        return 6;
    }
}
