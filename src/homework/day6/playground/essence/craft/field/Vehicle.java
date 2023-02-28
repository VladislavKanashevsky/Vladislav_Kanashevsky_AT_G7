package day6.playground.essence.craft.field;

import day6.playground.essence.Matter;

public abstract class Vehicle extends Matter {

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
