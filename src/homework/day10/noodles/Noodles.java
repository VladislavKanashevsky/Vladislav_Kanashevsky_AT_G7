package day10.noodles;

import java.util.ArrayList;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodle : noodles) {
            System.out.print("-" + noodle);
        }

        for (int i = 0; i < noodles.size(); i++) {
            String noodle = noodles.get(i);
            noodle = noodle.replace('a', 'o');
            noodles.set(i, noodle);
        }

        System.out.println();
        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
