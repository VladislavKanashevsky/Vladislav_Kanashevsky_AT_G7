package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ButterfliesRunner {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        List<String> butterFly = butterflies.stream().map(butterfly -> "\"" + butterfly + "\"").filter(butterfly -> butterfly.contains("o") && butterfly.contains("a")).collect(Collectors.toList());
        System.out.println(butterFly);

    }
}
