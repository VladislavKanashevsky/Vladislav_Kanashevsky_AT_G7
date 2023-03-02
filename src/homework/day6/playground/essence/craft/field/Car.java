package day6.playground.essence.craft.field;

public class Car extends Vehicle {

    protected int nameCar;
    String name;

    public Car(int nameCar, String name) {

        this.nameCar = nameCar;
        this.name = name;
    }

    public int getNameCar() {
        return nameCar;
    }

    public void setNameCar(int nameCar) {
        this.nameCar = nameCar;
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
