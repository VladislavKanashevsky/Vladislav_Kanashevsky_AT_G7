package day6.playground.essence.craft.hand;

import day6.playground.essence.Matter;

public abstract class Container extends Matter {

    protected String nameContainer;
    String name;

    public Container() {

    }

    public String getNameContainer() {
        return nameContainer;
    }

    public void setNameContainer(String nameContainer) {
        this.nameContainer = nameContainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
