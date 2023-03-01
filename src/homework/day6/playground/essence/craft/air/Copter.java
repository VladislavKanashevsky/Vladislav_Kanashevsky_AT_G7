package day6.playground.essence.craft.air;

public class Copter extends AirCraft {
    protected int nameCopter;
    String name;

    public Copter(int nameCopter, String name) {
        this.nameCopter = nameCopter;
        this.name = name;
    }

    public int getNameCopter() {
        return nameCopter;
    }

    public void setNameCopter(int nameCopter) {
        this.nameCopter = nameCopter;
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
