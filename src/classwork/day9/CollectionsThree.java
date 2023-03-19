package day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsThree {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        String string = " мама мыла раму мыла";
        String[] array = string.split(" ");

        for (String s : array) {
            mySet.add(s);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s1 : mySet) {
            System.out.println(s1);
        }
    }
}