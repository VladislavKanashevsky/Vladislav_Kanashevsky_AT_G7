package day6.playground.essence.creatures;

public abstract class Vegetables extends Plant {

    public Vegetables(int namePlant, String name) {
        super(namePlant, name);
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
