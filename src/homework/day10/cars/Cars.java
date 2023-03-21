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

        File file = new File("src\\homework\\day10\\cars\\cars.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        for (String car : cars) {
            out.write("-\"" + car + "\"\n");
        }
        out.close();


        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() > 4) {
                cars.remove(i);
                i--;
            }
        }

        for (String carTwo : cars) {
            System.out.print(carTwo + " ");
        }
    }
}

