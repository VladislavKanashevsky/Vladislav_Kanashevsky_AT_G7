package day9;

import java.util.HashMap;
import java.util.Map;

public class CollectionsFifth {

    public static void main(String[] args) {


        Map<Integer, String> words = new HashMap<>();
        String[] array = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }
        for (int i : words.keySet()) {
            System.out.println(i);
        }
        for (String s : words.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
