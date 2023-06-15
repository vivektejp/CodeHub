package day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArraySumMultithreaded {
    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;
    private static final int PARTIAL_SIZE = ARRAY_SIZE / THREAD_COUNT;

    private static int[] array = new int[ARRAY_SIZE];
    private static int[] partialSums = new int[THREAD_COUNT];

    public static void main(String[] args) {
        // Fill the array with values from 1 to 100
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }


        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);


        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * PARTIAL_SIZE;
            int endIndex = startIndex + PARTIAL_SIZE;

            executorService.execute(new ArraySumTask(startIndex, endIndex, i));
        }


        executorService.shutdown();


        while (!executorService.isTerminated()) {
            // Do nothing
        }


        int sum = 0;
        for (int partialSum : partialSums) {
            sum += partialSum;
        }

        System.out.println("Sum of the array elements: " + sum);
    }

    static class ArraySumTask implements Runnable {
        private int startIndex;
        private int endIndex;
        private int threadIndex;

        public ArraySumTask(int startIndex, int endIndex, int threadIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.threadIndex = threadIndex;
        }

        @Override
        public void run() {
            int partialSum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += array[i];
            }

            partialSums[threadIndex] = partialSum;
        }
    }
}
