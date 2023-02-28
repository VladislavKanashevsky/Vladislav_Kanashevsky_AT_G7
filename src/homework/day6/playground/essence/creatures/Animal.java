package day6.playground.essence.creatures;

import day6.playground.essence.Matter;

public abstract class Animal extends Matter {

    protected String nameAnimal;
    String name;

    public Animal() {

    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plant food) {
        System.out.printf("I am" + getNameAnimal() + " and I am eating" + food.getNamePlant());
    }
}

