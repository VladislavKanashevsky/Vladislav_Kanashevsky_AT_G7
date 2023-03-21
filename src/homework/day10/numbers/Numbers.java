package day10.numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (Integer number : numbers) {
            System.out.println(number + " ");
        }

        int counter = 0;
        for (Integer number : numbers) {
            counter += number;
        }
        System.out.println("\n" + "Сумма всех чисел: " + counter);

        Collections.sort(numbers);

        System.out.println();
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        Collections.reverse(numbers);

        System.out.println("\n");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
