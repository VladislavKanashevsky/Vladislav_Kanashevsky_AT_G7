package day6.playground.essence.craft.air;

public class Rocket extends Aircraft {

    protected int nameRocket;
    String name;

    public Rocket(int nameRocket, String name) {
        this.nameRocket = nameRocket;
        this.name = name;
    }

    public int getNameRocket() {
        return nameRocket;
    }

    public void setNameRocket(int nameRocket) {
        this.nameRocket = nameRocket;
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
