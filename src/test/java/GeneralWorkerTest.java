import static org.mockito.Mockito.*;
import org.junit.Test;
import ua.azbest.worker.GeneralWorker;
import ua.azbest.worker.Job;

public class GeneralWorkerTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Job mockQuest = mock(Job.class);
        GeneralWorker worker = new GeneralWorker(mockQuest);
        worker.doWork();
        verify(mockQuest, times(1)).work();
    }

}
