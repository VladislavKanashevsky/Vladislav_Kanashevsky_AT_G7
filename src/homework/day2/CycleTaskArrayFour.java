package day2;

public class CycleTaskArrayFour {
    public void printCycleTaskArrayFour() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
            System.out.print(array[i] + " ");
        }
    }
}
