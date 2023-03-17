package day8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MethodChainFile {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\kanas\\Vladislav_Kanashevsky_AT_G7\\src\\homework\\day8\\one\\two\\three\\four\\numberFirst.txt");

        File fileTwo = new File("C:\\Users\\kanas\\Vladislav_Kanashevsky_AT_G7\\src\\homework\\day8\\one\\two\\three\\four\\numberSecond.txt");

        BufferedWriter createNumber = new BufferedWriter(new FileWriter(file));
        createNumber.write("0 1 2 3 4 5 6 7 8 9");
        createNumber.close();

        BufferedWriter createNumberTwo = new BufferedWriter(new FileWriter(fileTwo));
        createNumberTwo.write("10 11 12 13 14 15 16 17 18 19");
        createNumberTwo.close();
    }
}