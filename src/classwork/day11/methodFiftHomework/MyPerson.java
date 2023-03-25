package day11.methodFiftHomework;

import java.util.Arrays;
import java.util.List;

public class MyPerson {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN), new Person("Катя", 28, Person.Sex.WOMEN), new Person("Вова", 24, Person.Sex.MAN), new Person("Маша", 38, Person.Sex.WOMEN), new Person("Роман Петрович", 72, Person.Sex.MAN));

        int counter = 0;
        for (Person person : people) {
            if (person.age > 18 && person.age < 55 && person.sex == Person.Sex.WOMEN) {
                counter++;
            }
        }
        System.out.println("Количество потенциально работоспособных женщин равное " + counter);
        System.out.println();

        int counterTwo = 0;
        for (Person person : people) {
            if (person.age > 18 && person.age < 60 && person.sex == Person.Sex.MAN) {
                counterTwo++;
            }
        }
        System.out.println("Количество потенциально работоспособных мужчин равное " + counterTwo);
        System.out.println();

        long s = people.stream().filter(person -> person.age > 18 && person.age < 55 && person.sex == Person.Sex.WOMEN).count();
        System.out.println("Количество потенциально работоспособных женщин методом stream API равное " + s);
        System.out.println();

        long s1 = people.stream().filter(person -> person.age > 18 && person.age < 60 && person.sex == Person.Sex.MAN).count();
        System.out.println("Количество потенциально работоспособных мужчин методом stream API равное " + s1);
        System.out.println();
    }
}
