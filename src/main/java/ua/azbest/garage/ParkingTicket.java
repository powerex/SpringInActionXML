package ua.azbest.garage;

public class ParkingTicket {

    private static long tickets = 0;
    private static long id;

    public ParkingTicket() {
        id = ++tickets;
    }

    public void info() {
        System.out.println(String.format("%06d", id));
    }
}
