package ua.azbest.garage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GarageApplication {
    public static void main(String[] args) throws MovingException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("garageConfig.xml");
        Vehicle bike = (Vehicle) context.getBean("bike");
        bike.move();

        Vehicle cbike = (Vehicle) context.getBean("childbike");
        cbike.move();

        Vehicle bbike = (Vehicle) context.getBean("modernBike");
        bbike.move();

        ParkingTicket t1 = (ParkingTicket) context.getBean("ticket");
        t1.info();
        ParkingTicket t2 = (ParkingTicket) context.getBean("ticket");
        t2.info();
        ParkingTicket t3 = (ParkingTicket) context.getBean("ticket");
        t3.info();

        GarageBox box = (GarageBox) context.getBean("box");

    }
}
