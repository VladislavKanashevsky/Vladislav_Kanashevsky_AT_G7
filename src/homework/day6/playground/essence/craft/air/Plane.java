package day6.playground.essence.craft.air;

public class Plane extends Aircraft {

    public Plane(int nameAirCraft, String name) {
        super(nameAirCraft, name);
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
