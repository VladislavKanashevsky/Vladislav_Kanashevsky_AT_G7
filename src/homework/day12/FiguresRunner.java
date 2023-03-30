package day12;

import java.util.stream.Stream;

public class FiguresRunner {

    public static void main(String[] args) {

        Stream<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        figures.mapToInt(String::length).filter(figure -> figure > 4).forEach(System.out::println);
    }
}

