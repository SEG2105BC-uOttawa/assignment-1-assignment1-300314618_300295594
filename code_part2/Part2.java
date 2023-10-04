import java.util.ArrayList;;
import java.util.Vector;
import java.util.Random;
import java.util.Iterator;

public class Part2 {

    public static void main(String[] args) {
        int size = 1000000;
        int[] randomIntegers = generateRandomIntegers(size);

        long arrayListTime = testArrayListConstruction(randomIntegers);
        //long vectorTime = testVectorConstruction(randomIntegers);
        //long arrayTime = testArrayConstruction(randomIntegers);

        System.out.println("ArrayList construction time: " + arrayListTime + " ms");
        //System.out.println("Vector construction time: " + vectorTime + " ms");
        //System.out.println("Array construction time: " + arrayTime + " ms");
    }

    private static int[] generateRandomIntegers(int size) {
        Random random = new Random();
        int[] randomIntegers = new int[size];
        for (int i = 0; i < size; i++) {
            randomIntegers[i] = random.nextInt(10);
        }
        return randomIntegers;
    }

    private static long testArrayListConstruction(int[] randomIntegers) {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int num : randomIntegers) {
            arrayList.add(num);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testVectorConstruction(int[] randomIntegers) {
        long startTime = System.currentTimeMillis();
        Vector<Integer> vector = new Vector<>();
        for(int num : randomIntegers) {
            vector.add(num);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testArrayConstruction(int[] randomIntegers) {
        long startTime = System.currentTimeMillis();
        int[] array = new int[randomIntegers.length];
        for(int i = 0; i < randomIntegers.length; i++) {
            array[i] = randomIntegers[i];
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}