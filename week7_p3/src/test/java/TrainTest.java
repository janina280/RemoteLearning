import com.nagarro.remotelearning.util.Train;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TrainTest {
    @Test
    public void addDuplicateTrainsTest() {
        Set<Train> trains = new HashSet<>();
        Train train1 = new Train(12, "R-E", 4);
        for (int index = 1; index <= 10; index++) {
            trains.add(train1);
        }
        assertEquals(1, trains.size());
    }
}

