package day6.playground.essence.craft.air;

import day6.playground.essence.Flyable;
import day6.playground.essence.Matter;
import day6.playground.essence.craft.Transportable;

public class Aircraft extends Matter implements Flyable, Transportable {

    protected int nameAirCraft;
    String name;

    public Aircraft(int nameAirCraft, String name) {
        this.nameAirCraft = nameAirCraft;
        this.name = name;
    }

    public int getNameAirCraft() {
        return nameAirCraft;
    }

    public void setNameAirCraft(int nameAirCraft) {
        this.nameAirCraft = nameAirCraft;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly(String direction) {
        Flyable.super.fly(direction);
    }

    @Override
    public int move(int pointA, int pointB) {
        return Transportable.super.move(pointA, pointB);
    }

    @Override
    public void move(int generateCoordinate) {

    }
}
