package day10.water;

import day10.items.Water;

import java.util.Arrays;
import java.util.List;

public class WaterProcess {

    public static void main(String[] args) {

        List<Water> waters = Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"));

        for (Water water : waters) {
            System.out.println(water.getColor() + "-" + water.getSmell());
        }
    }
}
