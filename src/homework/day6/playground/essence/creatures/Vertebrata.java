package day6.playground.essence.creatures;

public abstract class Vertebrata extends Animal implements Crawlable {

    protected int nameVertebrates;
    String name;

    public Vertebrata(int nameVertebrates, String name) {
        this.nameVertebrates = nameVertebrates;
        this.name = name;
    }

    public int getNameVertebrates() {
        return nameVertebrates;
    }

    public void setNameVertebrates(int nameVertebrates) {
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
