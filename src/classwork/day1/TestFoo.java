package day1;
import java.util.Random;

public class TestFoo {
    public static void main(String[] args) {
        new TestFoo().foo();
    }

    public void foo() {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }

        int summa = 0;

        for (int i : array) {
            summa += i;
        }
        System.out.println(summa);

    }
}

