package day9;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        String string = "мама мыла раму мыла";
        String[] array = string.split(" ");

        for (String s : array) {
            myList.add(s);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        for (String s1 : myList) {
            System.out.println(s1);
        }
    }
}