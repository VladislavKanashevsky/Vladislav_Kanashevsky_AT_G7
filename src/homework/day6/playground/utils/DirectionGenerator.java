package day6.playground.utils;

public class DirectionGenerator {

    public static String generateDirection() {

        int max = 39;
        int min = 1;
        int random = (int) (Math.random() * (max - min) + min);

        if (random <= 9) {
            return "NORTH";
        } else if (random <= 19) {
            return "SOUTH";
        } else if (random <= 29) {
            return "WEST";
        } else {
            return "EAST";
        }
    }
}
