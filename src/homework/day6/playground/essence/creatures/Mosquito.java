package day6.playground.essence.creatures;

import day6.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {

    public Mosquito(int nameInsect, String name) {
        super(nameInsect, name);
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
