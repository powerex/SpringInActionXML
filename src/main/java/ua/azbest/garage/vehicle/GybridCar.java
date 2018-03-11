package ua.azbest.garage.vehicle;

import ua.azbest.garage.MovingException;
import ua.azbest.garage.engine.Engine;

import java.util.Collection;

public class GybridCar implements Vehicle {

    private String color;
    private Collection<Engine> engines;

    public GybridCar() {
    }

    public void move() throws MovingException {
        System.out.print("Колір авто - " + color + ": ");
        for (Engine engine: engines)
            engine.work();
    }

    public void setEngines(Collection<Engine> engines) {
        this.engines = engines;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
