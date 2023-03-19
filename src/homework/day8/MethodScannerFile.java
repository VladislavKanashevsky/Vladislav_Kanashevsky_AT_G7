package day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodScannerFile {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("methodScannerFile.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println();
            System.out.println(line);
            String pattern = "(?=,|\\.|!| |')";
            String[] sum = line.split(pattern);
            System.out.println();
            System.out.println("Amount of words and punctuation marks are " + sum.length);
        }
        in.close();
    }
}

