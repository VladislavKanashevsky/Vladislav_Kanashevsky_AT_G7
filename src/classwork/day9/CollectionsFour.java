package day9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsFour {
    public static void main(String[] args) {

        Set<String> myList = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long tO = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList.add(" " + i);
        }
        long t1 = System.currentTimeMillis() - tO;
        System.out.println(t1);

        tO = System.currentTimeMillis();
        for (int j = 0; j < 10000000; j++) {
            myList2.add(" " + j);
        }
        t1 = System.currentTimeMillis() - tO;
        System.out.println(t1);
    }
}
