package day6.playground.essence.creatures;

import day6.playground.essence.Matter;

public abstract class Plant extends Matter {

    protected int namePlant;
    String name;

    public Plant(int namePlant, String name) {
        this.namePlant = namePlant;
        this.name = name;
    }

    public int getNamePlant() {
        return namePlant;
    }

    public void setNamePlant(int namePlant) {
        this.namePlant = namePlant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
