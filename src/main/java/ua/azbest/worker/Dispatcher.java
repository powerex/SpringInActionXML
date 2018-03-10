package ua.azbest.worker;

public class Dispatcher {
    public void entryBeforeWork() {
        System.out.println("Робітник вирушив на виконання завдання");
    }

    public void entryAfterWork() {
        System.out.println("Робітник прибув із виконаного завдання");
    }
}
