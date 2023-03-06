package day6.playground.essence.craft;

public interface Rideable {
    default void drive(String direction) {
        System.out.println("I am , " + getClass().getSimpleName() + " my name is " + getName() + " and I amd driving to " + direction);
    }

    String getName();
}