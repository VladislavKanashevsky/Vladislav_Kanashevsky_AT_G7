package day6.playground.essence.creatures;

import day6.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {

    protected int nameMosquito;
    String name;

    public Mosquito(int nameMosquito, String name) {
        this.nameMosquito = nameMosquito;
        this.name = name;
    }

    public int getNameMosquito() {
        return nameMosquito;
    }

    public void setNameMosquito(int nameMosquito) {
        this.nameMosquito = nameMosquito;
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
