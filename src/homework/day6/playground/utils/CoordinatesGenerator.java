package day6.playground.utils;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        int max = 79;
        int min = 1;
        int random = (int) (Math.random() * (max - min) + min);

        if (random <= 79) {
            System.out.println("CoordinatesGenerator: I have generated point with value: " + random);
        }
        return random;
    }
}


