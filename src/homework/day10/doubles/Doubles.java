package day10.doubles;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.floor;

public class Doubles {

    public static void main(String[] args) {

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (Double doubleTwo : doubles) {
            System.out.print(doubleTwo + " ");
        }
        System.out.println();

        double counter = 0.0;
        for (double summa : doubles) {
            counter += summa;
        }
        System.out.println("\n" + counter);
        System.out.println();

        double counterTwo = 0.0;
        for (double summaThree : doubles) {
            double doubleFour = floor(summaThree);
            double result = summaThree - doubleFour;
            counterTwo += result;
        }
        System.out.println(counterTwo);
        System.out.println();

        for (int i = 0; i < doubles.size(); i++) {
            double resultDouble = floor(doubles.get(i));
            System.out.print(resultDouble + " ");
        }
    }
}

