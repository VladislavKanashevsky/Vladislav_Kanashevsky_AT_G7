package day6.playground.essence.creatures;

import day6.playground.essence.Matter;

public abstract class Animal extends Matter {

    protected int nameAnimal;
    String name;

    public Animal(int nameAnimal, String name) {
        this.nameAnimal = nameAnimal;
        this.name = name;
    }

    public int getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(int nameAnimal) {
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

