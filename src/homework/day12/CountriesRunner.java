package day12;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {

        Stream.of("Андора", "Португалия", "Англия", "Замбия").filter(countries -> countries.contains("у") || countries.contains("е") || countries.contains("ы") || countries.contains("а") || countries.contains("о") || countries.contains("э") || countries.contains("я") || countries.contains("и") || countries.contains("ю")).filter(countries -> countries.length() < 7).map(String::toUpperCase).map(country -> "\"" + country + "\"").forEach(System.out::println);
    }
}
