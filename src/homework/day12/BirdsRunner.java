package day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        String resultBirds = birds.stream().map(bird -> bird.replace("о", "а")).collect(Collectors.joining()).toLowerCase().replace("ь", " ").replace("б", "\n");
        System.out.println("--" + resultBirds + "--");
    }
}
