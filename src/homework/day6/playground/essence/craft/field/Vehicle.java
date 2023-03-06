package day6.playground.essence.craft.field;

import day6.playground.essence.Matter;
import day6.playground.essence.craft.Rideable;
import day6.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {

    protected int nameVehicle;
    String name;

    public Vehicle(int nameVehicle, String name) {
        this.nameVehicle = nameVehicle;
        this.name = name;
    }

    public int getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(int nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}