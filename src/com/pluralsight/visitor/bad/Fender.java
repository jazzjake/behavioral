package com.pluralsight.visitor.bad;

public class Fender implements AtvPart {

    @Override
    public double calculateShipping() {
        return 3;
    }
}
