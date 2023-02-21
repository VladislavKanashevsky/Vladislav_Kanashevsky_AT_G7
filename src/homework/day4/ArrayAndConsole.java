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
        for (int i = array.length - 1; i > n; i--) {
            System.out.print(array[i]+" ");
        }
        return array;
    }

    public void processArrayAndConsoleThird() {

    }

    public void processArrayAndConsoleFourth() {
        String[] cow = {"           ^__^", "          (oo)\\\\_______", "         (__)\\ ) \\/ \\  \\", "              ||----w |\\", "              ||     ||"};
        for (int i = 0; i < cow.length; i++) {
            System.out.println(cow[i]);
        }
    }
}
