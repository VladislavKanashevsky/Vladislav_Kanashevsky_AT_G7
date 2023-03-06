package day6.playground.essence.creatures;

public class Beetle extends Insect {

    public Beetle(int nameInsect, String name) {
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

    public void nest(Carrot home) {
        if (getMass() > home.getMass()) {
            int theRemainderOfTheMass;
            theRemainderOfTheMass = getMass() / home.getMass();
            System.out.printf("I am " + getName() + " and I will nest there with " + theRemainderOfTheMass + " my family members!");
        } else {
            System.out.println("This carrot is too small for nesting :( ");
        }
    }
}
