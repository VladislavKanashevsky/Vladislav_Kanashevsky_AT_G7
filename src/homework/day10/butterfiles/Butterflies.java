package day10.butterfiles;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterfly : butterflies) {
            System.out.print("\"" + butterfly + "\"" + " ");
        }

        int counter = 0;

        for (String butterflyTwo : butterflies) {
            if (butterflyTwo.contains("o")) {
                counter++;
            }
        }
        System.out.println("\n" + "Amount of butterflies with \"o\" : " + counter + "\n");

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.println(i + 1 + ":" + butterflies.get(i) + " ");
        }

        for (String butterflyThree : butterflies) {
            System.out.println("\n" + butterflyThree);
        }
    }
}
