package day6.playground.essence;

public abstract class Matter {

    protected  String weight;

    int mass;

    public Matter() {

    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
