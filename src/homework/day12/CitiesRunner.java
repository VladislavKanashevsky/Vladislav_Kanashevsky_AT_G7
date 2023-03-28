package day12;

import java.util.ArrayList;
import java.util.List;

public class CitiesRunner {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        int summaChar = cities.stream().mapToInt(String::length).sum();
        System.out.println(summaChar);
    }
}
