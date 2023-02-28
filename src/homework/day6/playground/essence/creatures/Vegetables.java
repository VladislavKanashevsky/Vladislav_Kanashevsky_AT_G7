package day6.playground.essence.creatures;

public abstract class Vegetables extends Plant {

    protected String nameVegetables;
    String name;

    public Vegetables() {

    }

    public String getNameVegetables() {
        return nameVegetables;
    }

    public void setNameVegetables(String nameVegetables) {
        this.nameVegetables = nameVegetables;
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
