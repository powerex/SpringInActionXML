package ua.azbest.worker;

import java.io.PrintStream;

public class FixPipeJob implements Job {

    public FixPipeJob() {
    }

    public void work() {
        System.out.println("Почати роботу, щоб полагодити трубу!");
    }

}
