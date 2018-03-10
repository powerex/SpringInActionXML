package ua.azbest.garage.vehicle;

import ua.azbest.garage.Buzzer;
import ua.azbest.garage.MovingException;

public class BuzzBicycle extends Bicycle {

    private Buzzer buzzer;

    public BuzzBicycle(Buzzer buzzer) {
        super();
        this.buzzer = buzzer;
    }

    public BuzzBicycle(int countWheels, Buzzer buzzer) {
        super(countWheels);
        this.buzzer = buzzer;
    }

    @Override
    public void move() throws MovingException {
        super.move();
        System.out.println("While moving...");
        buzzer.sound();
    }
}
