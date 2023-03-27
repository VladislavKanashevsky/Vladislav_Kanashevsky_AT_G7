package day11;

import day11.methodFiftHomework.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyClassSix {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN), new Person("Катя", 28, Person.Sex.WOMEN), new Person("Вова", 24, Person.Sex.MAN), new Person("Маша", 38, Person.Sex.WOMEN), new Person("Роман Петрович", 72, Person.Sex.MAN));

        List<String> s = list.stream().sorted().collect(Collectors.toList());
        System.out.println(s);

        List<String> s1 = list.stream().sorted((s2, s3) -> -s2.compareTo(s3)).distinct().collect(Collectors.toList());
        System.out.println(s1);

        List<Person> s4 = people.stream().sorted((p1, p2) -> {
            if (p1.sex != p2.sex) {
                return p1.sex.compareTo(p2.sex);
            } else {
                return p1.age - p2.age;
            }
        }).peek(p -> System.out.println(p.name)).collect(Collectors.toList());
    }
}
