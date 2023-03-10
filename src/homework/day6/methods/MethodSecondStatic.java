package day6.methods;

public class MethodSecondStatic {
    public static void MethodSecondStaticProcess(String string) {
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            boolean isWords = false;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] != null && words[i].equals(words[j])) {
                    if (!isWords) {
                        System.out.print(words[j] + " ");
                        isWords = true;
                    }
                    words[j] = null;
                }
            }
        }
    }
}
