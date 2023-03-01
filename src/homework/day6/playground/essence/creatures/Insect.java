package day6.playground.essence.creatures;

import day6.playground.essence.Flyable;

public abstract class Insect extends Animal implements Flyable {

    protected String nameInsect;
    String name;

    public Insect() {
    }

    public String getNameInsect() {
        return nameInsect;
    }

    public void setNameInsect(String nameInsect) {
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
