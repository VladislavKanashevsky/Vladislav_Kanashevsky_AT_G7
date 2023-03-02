package day6.playground.essence.craft.field;

public class Moped extends Vehicle {

    protected int nameMoped;
    String name;

    public Moped(int nameMoped, String name) {

        this.nameMoped = nameMoped;
        this.name = name;
    }

    public int getNameMoped() {
        return nameMoped;
    }

    public void setNameMoped(int nameMoped) {
        this.nameMoped = nameMoped;
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
