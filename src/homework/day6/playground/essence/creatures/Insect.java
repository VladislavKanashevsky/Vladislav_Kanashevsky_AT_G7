package day6.playground.essence.creatures;

import day6.playground.essence.Flyable;

public abstract class Insect extends Animal implements Flyable, Crawlable {

    public Insect(int nameAnimal, String name) {
        super(nameAnimal, name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
