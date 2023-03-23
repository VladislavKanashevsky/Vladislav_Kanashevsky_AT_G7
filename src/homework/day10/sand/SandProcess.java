package day10.sand;

import day10.items.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandProcess {

    public static void main(String[] args) {

        List<Sand> sands = new ArrayList<>();

        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(4, "Речной"));
        sands.add(new Sand(2, "Карьерный"));
        sands.add(new Sand(7, "Речной"));

        for (Sand sand : sands) {
            System.out.print(sand.getWeigh() + " ");
        }
        System.out.println("\n");

        for (Sand sand : sands) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println("\n");

        Map<Integer, Sand> integerListSand = new HashMap<>();

        int key = 1;
        for (Sand sand : sands) {
            integerListSand.put(key++, sand);
        }

        for (int sandKey : integerListSand.keySet()) {
            System.out.println("Ключ : " + sandKey + " ");
        }
        System.out.println();

        for (Sand sandValues : integerListSand.values()) {
            System.out.print(sandValues.getName() + " ");
        }
        System.out.println("\n");

        for (Map.Entry<Integer, Sand> entry : integerListSand.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
