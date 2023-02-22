package day4;

public class ArrayRunner {

    public static void main(String[] args) {

        int[] array2 = {10, 15, 1, 4, 0, -7, 11, 8, 99};
        ArrayAndConsole arrayAndConsole = new ArrayAndConsole();
        System.out.println();
        arrayAndConsole.processArrayAndConsole(2, array2);
        System.out.println();
        arrayAndConsole.processArrayAndConsoleSecond(5, array2);
        System.out.println();
        arrayAndConsole.processArrayAndConsoleThird(array2);
        System.out.println();
        arrayAndConsole.processArrayAndConsoleFourth();
    }
}

