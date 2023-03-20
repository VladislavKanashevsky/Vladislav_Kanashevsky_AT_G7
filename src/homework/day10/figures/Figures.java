package day10.figures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Figures {
    public static void main(String[] args) throws IOException {

        List<String> figures = new ArrayList<>();

        figures.add("Овал");
        figures.add("Прямоугольник");
        figures.add("Круг");
        figures.add("Квадрат");
        figures.add("Эллипс");

        File file = new File("C:\\Users\\kanas\\Vladislav_Kanashevsky_AT_G7\\src\\homework\\day10\\figures\\figures.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        for (String figure : figures) {
            out.write(figure + "-");
        }
        out.close();

        System.out.println();

        int counter = 0;
        for (String figureTwo : figures) {
            if (!figureTwo.contains("и")) {
                counter++;
            }
            System.out.print(figureTwo + " ");
        }
        System.out.println();
        System.out.println("Количество фигур без \"и\" : " + counter);
        System.out.println();

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        figures.add(3, "Треугольник");

        for (String figureThree : figures) {
            System.out.print(figureThree + " ");
        }
        System.out.println();
    }
}

