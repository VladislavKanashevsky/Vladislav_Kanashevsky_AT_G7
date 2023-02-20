package homework.day2;

public class CycleTaskArraySeven {
    public void printCycleTaskArraySeven() {
        int[] array = {5, 6, 4, 2, 7, 3, 1};
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
            System.out.print(min + " ");
        }
    }
}

