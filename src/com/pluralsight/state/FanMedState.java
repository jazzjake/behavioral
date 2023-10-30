package com.pluralsight.state;

public class FanMedState extends State {

    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on high.");
        fan.setState(fan.getFanHighState());
    }

    public String toString() {
        return "Fan is med.";
    }
}
