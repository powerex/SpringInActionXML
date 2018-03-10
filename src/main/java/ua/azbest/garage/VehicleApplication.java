package ua.azbest.garage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.azbest.garage.vehicle.Vehicle;

public class VehicleApplication {
    public static void main(String[] args) throws MovingException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("garageConfig.xml");
        Vehicle car = (Vehicle) context.getBean("car");
        car.move();
    }
}
