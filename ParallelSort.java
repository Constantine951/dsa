package Scenarios;

/**
 * Done in Intel core i7 machine
 */

import java.util.Arrays;
import java.util.Random;

public class ParallelSort {
    public static void main(String[] args)
    {
        int numbers[] = new int[100];
        for (int i = 0; i < 1000; i += 10) {

            System.out.println("\nFor iteration number: "
                    + (i / 10 + 1));
            Random rand = new Random();

            for (int j = 0; j < 100; j++) {
                numbers[j] = rand.nextInt();
            }

            long startTime = System.nanoTime();

            // Performing Serial Sort
            Arrays.sort(numbers);

            long endTime = System.nanoTime();

            System.out.println("Start and End Time in Serial (in ns): "
                    + startTime + ":" + endTime);
            System.out.println("Time taken by Serial Sort(in ns): "
                    + (endTime - startTime));

            startTime = System.nanoTime();

            // Performing Parallel Sort
            Arrays.parallelSort(numbers);

            endTime = System.nanoTime();

            System.out.println("Start and End Time in parallel (in ns): "
                    + startTime + ":" + endTime);
            System.out.println("Time taken by Parallel Sort(in ns): "
                    + (endTime - startTime));
            System.out.println();
        }
    }
}

