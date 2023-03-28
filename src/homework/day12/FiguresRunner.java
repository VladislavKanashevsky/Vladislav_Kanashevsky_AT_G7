package day12;

import java.util.stream.Stream;

public class FiguresRunner {

    public static void main(String[] args) {

        Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс").mapToInt(String::length).filter(figures -> figures > 4).forEach(System.out::println);
    }
}

