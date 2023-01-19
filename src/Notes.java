import java.util.ArrayList;
import java.util.List;

public class Notes {

    private List<Integer> califications = new ArrayList<>();
    private float summedCalification;

    private final int TOTAL_CALIFICATIONS = 100000;
    private int splitNumber = 0;

    public float getSummedCalification() {
        return summedCalification;
    }

    synchronized public void addSummedCalification(float summedCalification) {
        this.summedCalification += summedCalification;
    }

    public List<Integer> getCalifications() {
        return califications;
    }

    public void generateCalification() {

        for (int i = 0; i < TOTAL_CALIFICATIONS; i++) {
            int randomCalification = (int) (Math.random() * 10);
            califications.add(randomCalification);
        }

    }

      public List<Integer> splitList() {

        List<Integer>calificationsReturnList = califications.subList(splitNumber , splitNumber + 10000 );

        splitNumber += 10000;

        return calificationsReturnList;

    }

}
