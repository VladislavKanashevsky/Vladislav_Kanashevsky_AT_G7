package day6.playground.essence.craft.air;

public class Plane extends AirCraft {
    protected int namePlane;
    String name;

    public Plane(int namePlane, String name) {
        this.namePlane = namePlane;
        this.name = name;
    }

    public int getNamePlane() {
        return namePlane;
    }

    public void setNamePlane(int namePlane) {
        this.namePlane = namePlane;
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
