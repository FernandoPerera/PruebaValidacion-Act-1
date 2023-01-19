public class Main {
    public static void main(String[] args) throws InterruptedException {

        Notes notes = new Notes();
        notes.generateCalification();

        RatingAdder thread1 = new RatingAdder(notes, 1, 0);
        RatingAdder thread2 = new RatingAdder(notes, 2, 10000);
        RatingAdder thread3 = new RatingAdder(notes, 3, 20000);
        RatingAdder thread4 = new RatingAdder(notes, 4, 30000);
        RatingAdder thread5 = new RatingAdder(notes, 5, 40000);
        RatingAdder thread6 = new RatingAdder(notes, 6, 50000);
        RatingAdder thread7 = new RatingAdder(notes, 7, 60000);
        RatingAdder thread8 = new RatingAdder(notes, 8, 70000);
        RatingAdder thread9 = new RatingAdder(notes, 9, 80000);
        RatingAdder thread10 = new RatingAdder(notes, 10, 90000);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();
        thread7.join();
        thread8.join();
        thread9.join();
        thread10.join();

        System.out.println("*******************");
        System.out.println("La media aritmetica es " + (notes.getSummedCalification() / 10));
        System.out.println("*******************");
    }
}