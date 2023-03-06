package day6.playground.essence.craft.field;

public class Motorbike extends  Vehicle {


    public Motorbike(int nameVehicle, String name) {
        super(nameVehicle, name);
    }

    @Override
    public void drive(String direction) {
        super.drive(direction);
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
