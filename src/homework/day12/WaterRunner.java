package day12;

import day10.items.Water;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {

    public static void main(String[] args) {

        Stream<Water> waterStream = Stream.of(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"), new Water("Синяя", "Мятный"));

        String result = waterStream.filter(water -> !water.getColor().equals("Прозрачная")).sorted(Comparator.comparing(Water::getSmell).reversed()).map(water -> {
            String smell = water.getSmell();
            if (smell.contains("ы")) {
                smell = smell.replace("ы", "ыы");
            }
            return new Water(water.getColor(), smell);
        }).map(Water::getSmell).collect(Collectors.joining());
        System.out.println(result.length());
    }
}
