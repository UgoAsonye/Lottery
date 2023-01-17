import java.util.Random;
public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        int key = random.nextInt(1,99999);
        int lotto = 0;
        int tries = 0;
        long start = System.nanoTime();
        while (lotto != key){
            lotto = random.nextInt(1,99999);
            tries ++;
        }
        long end = System.nanoTime();
        System.out.println("Time is: " + (end - start));
        System.out.println("The lottery number is: " + lotto);
        System.out.println("Number of tries is: " + tries);
    }
}

