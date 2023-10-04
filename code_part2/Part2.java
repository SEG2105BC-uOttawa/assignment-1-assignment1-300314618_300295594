import java.util.ArrayList;;
import java.util.Vector;
import java.util.Random;
import java.util.Iterator;

public class Part2 {

    public static void main(String[] args) {
        int size = 1000000;
        int[] randomIntegers = generateRandomIntegers(size);

        
        //Construction Tests
        long arrayListConstructionTime = 0;
        long vectorConstructionTime = 0;
        long arrayConstructionTime = 0;

        for (int i = 0; i < 2250; i++) { //about 10 seconds for ArrayList
            arrayListConstructionTime += testArrayListConstruction(randomIntegers);
            vectorConstructionTime += testVectorConstruction(randomIntegers);
            arrayConstructionTime += testArrayConstruction(randomIntegers);
        }

        System.out.println("ArrayList construction time: " + arrayListConstructionTime + " ms");
        System.out.println("Vector construction time: " + vectorConstructionTime + " ms");
        System.out.println("Array construction time: " + arrayConstructionTime + " ms");
        

        //Iteration Tests
        long arrayListIterationTime = 0;
        long vectorIterationTime = 0;
        long arrayIterationTime = 0;

        for (int i = 0; i < 2250; i++) { //about 10 seconds for ArrayList construction
            arrayListIterationTime += testArrayListIteration(randomIntegers);
            vectorIterationTime += testVectorIteration(randomIntegers);
            arrayIterationTime += testArrayIteration(randomIntegers);
        }

        System.out.println("ArrayList iteration time: " + arrayListIterationTime + " ms");
        System.out.println("Vector iteration time: " + vectorIterationTime + " ms");
        System.out.println("Array iteration time: " + arrayIterationTime + " ms");
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

    private static long testArrayListIteration(int[] randomIntegers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int num : randomIntegers) {
            arrayList.add(num);
        }
        int sum = 0;
        long startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            sum += iterator.next();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testVectorIteration(int[] randomIntegers) {
        Vector<Integer> vector = new Vector<>();
        for(int num : randomIntegers) {
            vector.add(num);
        }
        int sum = 0;
        long startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = vector.iterator();
        while(iterator.hasNext()) {
            sum += iterator.next();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testArrayIteration(int[] randomIntegers) {
        int[] array = new int[randomIntegers.length];
        for(int i = 0; i < randomIntegers.length; i++) {
            array[i] = randomIntegers[i];
        }
        int sum = 0;
        long startTime = System.currentTimeMillis();
        for(int num : array) {
            sum += num;
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}