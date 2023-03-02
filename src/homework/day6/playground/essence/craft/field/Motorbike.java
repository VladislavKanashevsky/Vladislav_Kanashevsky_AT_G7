package day6.playground.essence.craft.field;

public class Motorbike extends  Vehicle {

    protected int nameMotorbike;
    String name;

    public Motorbike(int nameMotorbike, String name) {

        this.nameMotorbike = nameMotorbike;
        this.name = name;
    }

    public int getNameMotorbike() {
        return nameMotorbike;
    }

    public void setNameMotorbike(int nameMotorbike) {
        this.nameMotorbike = nameMotorbike;
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
