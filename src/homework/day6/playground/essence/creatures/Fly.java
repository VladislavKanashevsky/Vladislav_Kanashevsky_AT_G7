package day6.playground.essence.creatures;

import day6.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    protected int nameFly;
    String name;

    public Fly(int nameFly, String name) {
        this.nameFly = nameFly;
        this.name = name;
    }

    public int getNameFly() {
        return nameFly;
    }

    public void setNameFly(int nameFly) {
        this.nameFly = nameFly;
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
