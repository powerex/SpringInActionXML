package ua.azbest.garage;

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
