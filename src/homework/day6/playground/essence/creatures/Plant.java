package day6.playground.essence.creatures;

import day6.playground.essence.Matter;

public abstract class Plant extends Matter {

    protected String namePlant;
    String name;

    public Plant() {

    }

    public String getNamePlant() {
        return namePlant;
    }

    public void setNamePlant(String namePlant) {
        this.namePlant = namePlant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
