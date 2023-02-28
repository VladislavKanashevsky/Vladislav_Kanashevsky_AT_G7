package day6.playground.essence.creatures;

public class Carrot extends Vegetables {
    protected String nameCarrot;
    String name;

    Carrot (){
    }

    public String getNameCarrot() {
        return nameCarrot;
    }

    public void setNameCarrot(String nameCarrot) {
        this.nameCarrot = nameCarrot;
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
