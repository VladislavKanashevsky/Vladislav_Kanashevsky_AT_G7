package day12;

import java.util.stream.Stream;

public class CarRunner {
    public static void main(String[] args) {

        Stream<String> car = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");

        car.distinct().filter(cars -> cars.contains("и")).skip(1).map(String::toUpperCase).forEach(System.out::println);
    }
}
