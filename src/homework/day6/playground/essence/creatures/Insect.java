package day6.playground.essence.creatures;

import day6.playground.essence.Flyable;

public abstract class Insect extends Animal implements Flyable,Crawlable {

    protected int nameInsect;
    String name;

    public Insect(int nameInsect, String name) {
        this.nameInsect = nameInsect;
        this.name = name;
    }

    public int getNameInsect() {
        return nameInsect;
    }

    public void setNameInsect(int nameInsect) {
        this.nameInsect = nameInsect;
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
