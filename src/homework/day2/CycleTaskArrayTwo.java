package day2;

public class CycleTaskArrayTwo {
    public void printCycleTaskArrayTwo() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
    }
}

