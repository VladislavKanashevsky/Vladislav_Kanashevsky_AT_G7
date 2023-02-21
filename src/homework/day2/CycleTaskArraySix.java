package day2;

public class CycleTaskArraySix {
    public void printCycleTaskArraySix() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int number = array[0];
        array[0] = array[6];
        array[6] = number;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

