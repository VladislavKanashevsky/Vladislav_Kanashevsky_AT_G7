package day2;

import java.util.Random;

public class CycleTaskArray {
    public void printCycleTaskArray() {
        int[] arrays = new int[7];
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(1000);
            System.out.print(arrays[i] + " ");
        }
    }
}
