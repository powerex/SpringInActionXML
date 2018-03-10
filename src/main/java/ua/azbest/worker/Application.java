package ua.azbest.worker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("WorkerJob.xml");
        Worker worker = (Worker) context.getBean("worker");
        worker.doWork();
    }

}
