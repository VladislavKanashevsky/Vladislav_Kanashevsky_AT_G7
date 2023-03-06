package day6.playground.utils;

public class DistanceGenerator {
    public static int generateDistance() {

        int max = 99;
        int min = 1;
        int random = (int) (Math.random() * (max - min) + min);

        if (random <= 99) {
            System.out.println("DistanceGenerator: I have generated distance with value: " + random);
        }
        return random;
    }
}
