package day6.playground.essence.craft.field;

public class Moped extends Vehicle {

    public Moped(int nameVehicle, String name) {
        super(nameVehicle, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        return super.move(pointA, pointB);
    }

    @Override
    public void move(int generateCoordinate) {

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
