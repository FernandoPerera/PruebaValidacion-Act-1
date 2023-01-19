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

    @Override
    public void run() {

        List<Integer> calificationsList =  notes.splitList();

        for (int i = 0; i < calificationsList.size(); i++) {
            totalAmount += calificationsList.get(i);
            countNumbers += 1;
        }
        notes.addSummedCalification(totalAmount);

        String output = "\n------------------------";
        output += "\nEl hilo " + threadId + " ha contado " + countNumbers + " calificaciones";
        output += "\nComenzo en el indice " + indexOfList + " y ha sumado un total de " + totalAmount;
        output += "\n------------------------\n";

        System.out.println(output);

    }
}
