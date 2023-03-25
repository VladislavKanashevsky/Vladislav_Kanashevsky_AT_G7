package day11.methodFour;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyClassFour {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        String s = list.stream().findFirst().orElse("мама");
        System.out.println(s);

        String s1 = list.stream().filter("мама"::equals).findFirst().get();
        System.out.println(s1);

        String s2 = list.stream().skip(4).findFirst().get();
        System.out.println(s2);

        List<String> s3 = list.stream().skip(2).limit(2).collect(Collectors.toList());
        System.out.println(s3);

        List<String> s4 = list.stream().filter(s5 -> s5.contains("м")).distinct().collect(Collectors.toList());
        System.out.println(s4);

    }
}