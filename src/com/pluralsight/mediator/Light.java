package com.pluralsight.mediator;

//receiver
public class Light {

    private Boolean isOn = false;

    private String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void toggle() {
        if(isOn) {
            off();
            isOn = false;
        }
        else {
            on();
            isOn = true;
        }
    }
    public void on() {
        System.out.println("Light switched on.");
    }

    public void off() {
        System.out.println("Light switched off.");
    }

    public Boolean isOn() {
        return isOn;
    }
}
