package day6.playground.essence.craft.hand;

import day6.playground.essence.Matter;

public abstract class Container extends Matter {

    protected int nameContainer;
    String name;

    public Container(int nameContainer, String name) {
        this.nameContainer = nameContainer;
        this.name = name;
    }

    public int getNameContainer() {
        return nameContainer;
    }

    public void setNameContainer(int nameContainer) {
        this.nameContainer = nameContainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
