package day4;

public class ArrayAndConsole {

    public void processArrayAndConsole(int n, int[] array) {
        int sum = 0;
        for (int i = n - 1; i < array.length; i += n) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    public int[] processArrayAndConsoleSecond(int n, int[] array) {

        int len = 0;

        for (int i = 0; array.length > i; i++) {
            if (array[i] > n) {
                len++;
            }
        }

        int[] resultArray = new int[len];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                resultArray[j] = array[i];
                System.out.print(resultArray[j] + " ");
                j++;
            }
        }
        return resultArray;
    }

    public void processArrayAndConsoleThird(int[] array) {
        int result = 0;
        int month = 2;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (array[i] % month != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public void processArrayAndConsoleFourth() {
        String[] cow = {"          ^__^", "          (oo)\\\\_______", "         (__)\\ ) \\/ \\  \\", "              ||----w |\\", "              ||     ||"};
        for (int i = 0; i < cow.length; i++) {
            System.out.println(cow[i]);
        }
    }
}
