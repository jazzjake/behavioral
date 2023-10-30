package com.pluralsight.visitor.bad;

public class Oil implements AtvPart {

    @Override
    public double calculateShipping() {
        return 9;
    }
}
