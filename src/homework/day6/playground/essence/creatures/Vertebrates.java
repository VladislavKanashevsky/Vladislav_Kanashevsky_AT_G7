package day6.playground.essence.creatures;

public abstract class Vertebrates extends Animal {

    protected String nameVertebrates;
    String name;

    public Vertebrates() {

    }

    public String getNameVertebrates() {
        return nameVertebrates;
    }

    public void setNameVertebrates(String nameVertebrates) {
        this.nameVertebrates = nameVertebrates;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void eat(Insect food) {
        System.out.printf("I am " + nameVertebrates + " and I am eating" + food.getNameInsect());
    }
}
