package day6.playground.utils;

public class DirectionGenerator {

    public static String generateDirection() {

        int max = 39;
        int min = 1;
        int random = (int) (Math.random() * (max - min) + min);

        if (random <= 9) {
            System.out.println("NORTH");
            return "NORTH";
        } else if (random <= 19) {
            System.out.println("SOUTH");
            return "SOUTH";
        } else if (random <= 29) {
            System.out.println("WEST");
            return "WEST";
        } else {
            System.out.println("EAST");
            return "EAST";
        }
    }
}
