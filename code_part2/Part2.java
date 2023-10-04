import java.utim.ArrayList;;
import java.util.Vector;
import java.util.Random;
import java.util.Iterator;

public class Part2 {

    public static void main(String[] args) {

    }

    private static int[] generateRandomIntegers(int size) {
        Random random = new Random();
        int[] randomIntegers = new int[size];
        for (int i = 0; i < size; i++) {
            randomIntegers[i] = random.nextInt(10);
        }
        return randomIntegers;
    }

}