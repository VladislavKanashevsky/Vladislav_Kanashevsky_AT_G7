package day2;

public class CycleTaskArrayFive {
    public void printCycleTaskArrayFive() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int min = array[0];
        for (int i = 2; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print(min + " ");
    }
}
