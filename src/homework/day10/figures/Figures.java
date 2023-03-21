package day10.figures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Figures {

    public static void main(String[] args) throws IOException {

        String[] figure = {"Овал", "Прямоугольник", "Круг", "Эллипс"};

        List<String> figures = Arrays.asList(figure);

        File file = new File("src\\homework\\day10\\figures\\figures.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        for (String figureTwo : figures) {
            out.write(figureTwo + "-");
        }
        out.close();

        int counter = 0;
        for (String figureThree : figures) {
            if (!figureThree.contains("и")) {
                counter++;
            }
            System.out.print(figureThree + " " + "\n");
        }
        System.out.print("\n" + "Количество фигур без \"и\" : " + counter + "\n");

        System.out.println();
        for (int i = 0; i < figures.size(); i++) {
            System.out.print(i + 1 + ")" + figures.get(i) + " ");
        }

        figures.set(3, "Треугольник");

        System.out.println("\n");

        for (String figureFour : figures) {
            System.out.print(figureFour + " ");
        }
    }
}

