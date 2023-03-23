package day10.bubbles;

import day10.items.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubblesProcess {

    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println("\n");

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println("\n");

        int counter = 0;
        for (Bubble bubble : bubbles) {
            counter += bubble.getVolume();
        }
        System.out.print("Объём всех пузырей : " + counter);
        System.out.println("\n");

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
