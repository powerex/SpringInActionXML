package ua.azbest.garage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.azbest.garage.vehicle.Vehicle;

public class VehicleApp2 {
    public static void main(String[] args) throws MovingException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("carConfigWithP.xml");
        Vehicle car = (Vehicle) context.getBean("car");
        car.move();

        Vehicle gybrid = (Vehicle) context.getBean("gybrid");
        gybrid.move();
    }
}
