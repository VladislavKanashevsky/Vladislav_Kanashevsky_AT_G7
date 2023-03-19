package day9;

import java.util.ArrayList;
import java.util.List;

public class CollectionsEight {

    public static void main(String[] args) {

        List<String> vegetables = new ArrayList<>();

        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String s : vegetables) {
            System.out.print(s + " ");
        }

        int counter = 0;

        for (String vegetable : vegetables) {
            if (vegetable.contains("а")) {
                counter++;
            }
            System.out.print(vegetable + " ");
        }
        System.out.println(counter);

        System.out.println();
        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(vegetables.get(i) + " ");
        }

        vegetables.remove("Огурец");
        vegetables.remove(3);

        System.out.println();
        for (String s1 : vegetables) {
            System.out.print(s1 + " ");

        }
    }
}

