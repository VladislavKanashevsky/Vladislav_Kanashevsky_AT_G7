package homework.day2;

public class CycleTaskArrayThree {
    public void printCycleTaskArrayThree() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array.length; i++) {
            array[i] *= 5;
            System.out.print(array[i] + " ");
        }
    }
}
