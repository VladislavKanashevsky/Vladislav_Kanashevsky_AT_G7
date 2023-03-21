package day10.birds;

import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

        String[] bird = {"Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"};

        List<String> birds = Arrays.asList(bird);

        for (String birdTwo : birds) {
            System.out.print("--" + birdTwo + "--" + "\n");
        }
        System.out.print("\n");

        int counter = 0;
        for (String birdThree : birds) {
            int counterTwo = 0;
            for (char c : birdThree.toLowerCase().toCharArray()) {
                if ("уеаоэяию".indexOf(c) != -1) {
                    counterTwo++;
                }
            }
            if (counterTwo > 1) {
                counter++;
            }
        }

        System.out.println("Количкество птиц, где больше 1 гласной : " + counter + "\n");

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


