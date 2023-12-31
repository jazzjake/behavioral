package com.pluralsight.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {

    private Timer timer;

    public MediatorEverydayDemo(int seconds) {
        timer = new Timer();
        //tasks dont need to know about each other
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }
    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {
        public void run() {
            System.out.println("Now Time's really up!");
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        System.out.println("About to schedule a task.");
        new MediatorEverydayDemo(3);
        System.out.println("Task scheduled.");
    }
}
