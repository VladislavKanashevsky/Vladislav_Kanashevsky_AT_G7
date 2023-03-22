package day10.countries;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();

        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String country : countries) {
            System.out.print(country + ", ");
        }

        int counter = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                counter++;
            }
        }
        System.out.print("\n" + "\n" + "Количество стран в которых меньше 7 букв : " + counter + "\n");

        System.out.print("\n");

        for (int i = 0; i < countries.size(); i++) {
            System.out.print(i + 1 + ")" + countries.get(i) + " " + "\n");
        }
    }
}
