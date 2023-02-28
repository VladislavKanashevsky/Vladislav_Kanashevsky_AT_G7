package day6.playground.essence.creatures;

public abstract class Flowers extends Plant {

    protected String nameFlowers;
    String name;

    public Flowers() {

    }

    public String getNameFlowers() {
        return nameFlowers;
    }

    public void setNameFlowers(String nameFlowers) {
        this.nameFlowers = nameFlowers;
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
