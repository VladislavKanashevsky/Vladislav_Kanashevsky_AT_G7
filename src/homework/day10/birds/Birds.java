package day10.birds;

import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String birdTwo : birds) {
            System.out.print("--" + birdTwo + "--" + "\n");
        }
        System.out.print("\n");

        int counter = 0;
        for (String birdThree : birds) {
            int vowels = 0;
            for (int i = 0; i < birdThree.length(); i++) {
                char ch = birdThree.charAt(i);
                if (ch == 'у' || ch == 'е' || ch == 'а' || ch == 'о' || ch == 'э' || ch == 'ы' || ch == 'я' || ch == 'и' || ch == 'ю') {
                    vowels++;
                }
            }
            if (vowels > 1) {
                counter++;
            }
        }
        System.out.println("Количество птиц с больше чем одной гласной: " + counter);


        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println("\n");

        birds.set(2, "Синица");

        for (String birdFour : birds) {
            System.out.print(birdFour + " ");
        }
    }
}


