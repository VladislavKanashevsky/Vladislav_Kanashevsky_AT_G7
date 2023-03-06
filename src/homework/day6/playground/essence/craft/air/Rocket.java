package day6.playground.essence.craft.air;

public class Rocket extends Aircraft {

    public Rocket(int nameAirCraft, String name) {
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
