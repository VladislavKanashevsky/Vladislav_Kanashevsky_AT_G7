package day6.playground.essence.craft.air;

import day6.playground.essence.Flyable;
import day6.playground.essence.craft.Transportable;

public class Copter extends Aircraft implements Transportable, Flyable {

    public Copter(int nameAirCraft, String name) {
        super(nameAirCraft, name);
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
