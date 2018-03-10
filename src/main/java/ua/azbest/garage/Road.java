package ua.azbest.garage;

import org.jetbrains.annotations.Contract;

public class Road {

    private Road() {
    }

    private static class RoadSingeltonHolder {
        static Road instance = new Road(); // створення екземпляра
    }

    @Contract(pure = true)
    public static Road getInstance() { // Повернення екземпляра
        return RoadSingeltonHolder.instance;
    }
}
