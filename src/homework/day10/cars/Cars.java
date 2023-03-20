package day10.cars;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static void main(String[] args) throws IOException {

        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        File file = new File("C:\\Users\\kanas\\Vladislav_Kanashevsky_AT_G7\\src\\homework\\day10\\cars\\cars.txt");

        for (String car : cars) {
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            out.write("-" + "\"" + car + "\"");
            out.close();
        }

    }
}
