package day12;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumbersModRunner {

    public static void main(String[] args) {

        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);

        String[] words = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        numbersMod.filter(number -> Integer.toString(number).contains("3")).flatMap(number -> Arrays.stream(Integer.toString(number).split(""))).map(number -> words[Integer.parseInt(number)]).distinct().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);

    }
}
