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

        boolean s5 = list.stream().anyMatch(s6 -> s6.equals("мама"));
        System.out.println(s5);

        boolean s7 = list.stream().allMatch(s8 -> s8.contains("м"));
        System.out.println(s7);

        List<String> s8 = list.stream().map(s9 -> s9 + "м").collect(Collectors.toList());
        System.out.println(s8);

        List<String> s9 = list.stream().flatMap(s10 -> Arrays.stream(s10.split("а")).filter(s11 -> !s11.isEmpty())).collect(Collectors.toList());
        System.out.println(s9);


    }
}