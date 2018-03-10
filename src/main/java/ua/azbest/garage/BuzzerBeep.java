package ua.azbest.garage;

public class BuzzerBeep implements Buzzer {

    private static String sound = "BEEP";

    public BuzzerBeep() {
    }

    public void sound() {
        for (int i=0; i<3; i++)
            System.out.println(sound + " "  );
    }
}
