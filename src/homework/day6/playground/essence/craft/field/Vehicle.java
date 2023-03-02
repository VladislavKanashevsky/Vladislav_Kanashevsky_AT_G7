package day6.playground.essence.craft.field;

import day6.playground.essence.Matter;
import day6.playground.essence.craft.Rideable;
import day6.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {

    protected String nameVehicle;
    String name;

    public Vehicle() {
    }

    public String getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
