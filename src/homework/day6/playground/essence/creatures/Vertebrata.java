package day6.playground.essence.creatures;

public abstract class Vertebrata extends Animal implements Crawlable {

    public Vertebrata(int nameAnimal, String name) {
        super(nameAnimal, name);
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
        System.out.printf("I am " + nameAnimal + " and I am eating" + food.getNameAnimal());
    }
}
