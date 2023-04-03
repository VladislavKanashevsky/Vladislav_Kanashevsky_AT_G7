package day12;

import day10.items.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubblesRunner {
    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

        int sum = bubbles.stream().filter(b -> b.getVolume() > 3).sorted((b1, b2) -> b1.getName().compareTo(b2.getName())).map(b -> new Bubble(b.getVolume() * 3, b.getName())).mapToInt(bubble -> (int) bubble.getVolume()).sum();
        System.out.println(sum);
    }
}

