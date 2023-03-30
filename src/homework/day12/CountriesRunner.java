package day12;

import java.util.stream.Stream;

public class CountriesRunner {

    public static void main(String[] args) {

        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");

        countries.filter(country -> country.contains("у") || country.contains("е") || country.contains("ы") || country.contains("а") || country.contains("о") || country.contains("э") || country.contains("я") || country.contains("и") || country.contains("ю")).filter(country -> country.length() < 7).map(String::toUpperCase).map(country -> "\"" + country + "\"").forEach(System.out::println);
    }
}
