package day6.playground.essence;

public interface Flyable {

    default void fly(String direction) {
        System.out.println("I am , " + getClass().getSimpleName() + " my name is" + getName() + " and I amd flying to " + direction);
    }

    String getName();
}
