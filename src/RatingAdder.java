import java.util.List;

public class RatingAdder extends Thread{

    private Notes notes;
    private int threadId;
    private int indexOfList;
    private float totalAmount;
    private int countNumbers = 0;

    public RatingAdder(Notes notes, int threadId, int indexOfList) {
        this.notes = notes;
        this.threadId = threadId;
        this.indexOfList = indexOfList;
    }

    public void run() {

        List<Integer> calificationsList =  notes.splitList();

        for (int i = 0; i < calificationsList.size(); i++) {
            totalAmount += calificationsList.get(i);
            countNumbers += 1;
        }
        notes.setSummedCalification(totalAmount);

        System.out.println("\n------------------------");
        System.out.println("El hilo " + threadId + " ha contado " + countNumbers + " calificaciones");
        System.out.println("Comenzo en el indice " + indexOfList + " y a sumado un total de " + totalAmount);
        System.out.println("------------------------\n");

    }
}
