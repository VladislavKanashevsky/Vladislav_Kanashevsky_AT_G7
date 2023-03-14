package day6.playground.essence.creatures;

public abstract class Flowers extends Plant {

    public Flowers(int namePlant, String name) {
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
