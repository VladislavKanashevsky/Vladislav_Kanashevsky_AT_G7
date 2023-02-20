package day1;

public class Bee {
    String gender;
    long weight;

    public Bee() {
        gender = "Bee";
        weight = 250;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    protected void printBeeDetails() {
        System.out.println("Я легче лося в " + 500000 / getWeight() + "раз");
    }
}

