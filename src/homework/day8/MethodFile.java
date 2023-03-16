package day8;


import java.io.File;

public class MethodFile {
    public static void main(String[] args) {
        File file = new File("c:/");
        for (File files : file.listFiles()) {
            System.out.println(files.getName());
        }
    }
}
