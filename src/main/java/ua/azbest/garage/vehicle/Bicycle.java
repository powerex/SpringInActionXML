package ua.azbest.garage.vehicle;

import ua.azbest.garage.MovingException;

public class Bicycle implements Vehicle {

    private int countWheels = 2;

    public Bicycle() {
    }

    public Bicycle(int countWheels) {
        this.countWheels = countWheels;
    }

    public void move() throws MovingException {
        System.out.println("Moving on " + countWheels + " wheels");
    }
}
