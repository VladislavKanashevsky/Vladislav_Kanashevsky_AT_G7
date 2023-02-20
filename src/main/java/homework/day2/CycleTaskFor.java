package homework.day2;

public class CycleTaskFor {
    public void printCycleTaskFor() {
        for (int i = 3; i <= 19; i++) {
            if (i % 2 != 1) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
