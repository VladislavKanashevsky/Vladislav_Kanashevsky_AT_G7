package day10.furniture;

import day10.items.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FurnitureProcess {

    public static void main(String[] args) {

        List<Chair> chairs = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));

        for (Chair chair : chairs) {
            System.out.print(chair.getHeight() * chair.getWidth() + " ");
        }
        System.out.println("\n");

        Map<Integer, Chair> integerChairMap = new HashMap<>();

        int key = 1;
        for (Chair chair : chairs) {
            integerChairMap.put(key++, chair);
        }

        for (int chairKey : integerChairMap.keySet()) {
            System.out.print("Ключи :" + chairKey + " ");
        }
        System.out.println("\n");

        for (Chair chairValues : integerChairMap.values()) {
            System.out.println(chairValues + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Chair> entry : integerChairMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
