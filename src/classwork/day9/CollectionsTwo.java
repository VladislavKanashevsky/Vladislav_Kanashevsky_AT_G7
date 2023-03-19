package day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTwo {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long tO = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myList.add(" ");
        }
        long t1 = System.currentTimeMillis() - tO;
        System.out.println(t1);

        tO = System.currentTimeMillis();
        for (int j = 0; j < 1000000; j++) {
            myList2.add(" ");
        }
        t1 = System.currentTimeMillis() - tO;
        System.out.println(t1);
    }
}