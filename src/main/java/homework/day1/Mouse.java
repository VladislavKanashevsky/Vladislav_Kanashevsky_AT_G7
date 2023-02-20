package day1;

public class Mouse {
    public String name;
    public int age;

    public Mouse() {
        name = "Джери";
        age = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь, меня зовут " + getName() + " и мне " + getAge() + " лет");
    }
}




