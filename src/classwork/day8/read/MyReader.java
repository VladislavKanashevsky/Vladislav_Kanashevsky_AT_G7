package day8.read;

import java.io.*;

public class MyReader {

    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    public static void write() throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        out.write("Hello World 2.0");
        out.close();
    }
}
