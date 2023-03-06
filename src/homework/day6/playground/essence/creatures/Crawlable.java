package day6.playground.essence.creatures;

public interface Crawlable {

    default void crawl(String direction, int distance) {
        System.out.println("I am , " + getClass().getSimpleName() + " my name is " + getName() + " and I am crawling to " + direction + " for " + distance + " units");
    }

    String getName();
}
