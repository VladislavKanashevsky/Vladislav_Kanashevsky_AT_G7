package day12;

import day10.items.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SandRunner {

    public static void main(String[] args) throws IOException {

        List<Sand> sand = new ArrayList<>();

        sand.add(new Sand(12, "Речной"));
        sand.add(new Sand(8, "Речной"));
        sand.add(new Sand(15, "Карьерный"));
        sand.add(new Sand(7, "Карьерный"));
        sand.add(new Sand(11, "Речной"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sand.txt"))) {
            for (Map.Entry<Integer, String> sander : sand.stream().filter(s -> s.getWeigh() > 9 && s.getName().contains("ч")).sorted(Comparator.comparing(Sand::getWeigh)).map(s -> new Sand(s.getWeigh() * 2, s.getName().toUpperCase())).collect(Collectors.toMap(Sand::getWeigh, Sand::getName)).entrySet()) {
                writer.write(sander.getValue() + ":" + sander.getKey() + "\n");
            }
        } catch (IOException ex) {
            System.out.println("IOException - невозможно осуществить запись в файл");
        }
    }
}


