package day11.methodOne;

public class Runner {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(() -> 2.2);   //однострочный
        mc.justMethod(() -> {   //блочный
            double pl = 3.111;
            return pl;
        });
    }
}
