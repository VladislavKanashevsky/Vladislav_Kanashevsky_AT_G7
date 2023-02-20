package homework.day1;

public class Souse {
    private String name;
    private String color;

    public Souse() {
        name ="Сырный";
        color = "желтого";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printSouseDetails() {
        Souse souse = new Souse();
        System.out.println("Это соус " + getName()+" " + getColor() + " цвета ");
    }
}
