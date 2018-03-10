package ua.azbest.worker;

public class GeneralWorker implements Worker {

    private Job job;

    public GeneralWorker(Job quest) {
        this.job = quest;
    }

    public void doWork() {
        job.work();
    }
}
