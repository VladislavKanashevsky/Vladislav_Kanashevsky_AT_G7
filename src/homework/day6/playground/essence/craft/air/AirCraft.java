package day6.playground.essence.craft.air;

import day6.playground.essence.Flyable;
import day6.playground.essence.Matter;

public abstract class AirCraft extends Matter implements Flyable {

    protected String nameAirVehicles;
    String name;

    public AirCraft() {

    }

    public String getNameAirVehicles() {
        return nameAirVehicles;
    }

    public void setNameAirVehicles(String nameAirVehicles) {
        this.nameAirVehicles = nameAirVehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
