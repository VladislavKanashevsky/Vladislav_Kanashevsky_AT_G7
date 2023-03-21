package day10.doubles;

import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (Double doubleTwo : doubles) {
            System.out.print(doubleTwo + " ");
        }

        double counter = 0;
        for (double summa : doubles) {
            counter += summa;
        }
        System.out.println("\n" + "\n" + counter);

        //найти сумму всех дробных частей и вывести результат в консоль ??

        //Проитерировать список по индексу и вывести целые части в консоль через пробел ??
    }
}

