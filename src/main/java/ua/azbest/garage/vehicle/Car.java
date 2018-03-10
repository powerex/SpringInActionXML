package ua.azbest.garage.vehicle;

import ua.azbest.garage.engine.Engine;
import ua.azbest.garage.MovingException;

public class Car implements Vehicle {

    private String color;
    private Engine engine;

    public Car() {
    }

    public void move() throws MovingException {
        System.out.print("Колір авто - " + color + ": ");
        engine.work();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) { // Встановлення кольору
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) { // Встановлення двигура
        this.engine = engine;
    }
}
