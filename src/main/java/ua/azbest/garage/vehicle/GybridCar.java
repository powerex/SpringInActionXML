package ua.azbest.garage.vehicle;

import ua.azbest.garage.MovingException;
import ua.azbest.garage.engine.Engine;

import java.util.Map;

public class GybridCar implements Vehicle {

    private String color;
    private Map<String, Engine> engines;

    public GybridCar() {
    }

    public void move() throws MovingException {
        System.out.print("Колір авто - " + color + ": ");
        for (String key: engines.keySet()) {
            System.out.print(key + ": ");
            Engine engine = engines.get(key);
            engine.work();
        }
    }

    public void setEngines(Map<String, Engine> engines) {
        this.engines = engines;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
