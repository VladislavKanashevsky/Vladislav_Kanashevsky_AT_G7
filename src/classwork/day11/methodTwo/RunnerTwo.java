package day11.methodTwo;

public class RunnerTwo {
    public static void main(String[] args) {
        MyClassTwo mc = new MyClassTwo();
        mc.justMethodTwo(System.out::println);
        mc.justMethodTwo(string -> System.out.println(string));
    }
}
