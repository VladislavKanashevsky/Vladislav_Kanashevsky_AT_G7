package day11.methodThree;

import day11.methodFour.ClassX;

public class RunnerThree {
    public static void main(String[] args) {
        MyClassThree mc = new MyClassThree();
        mc.justMethod(ClassX::new);
    }
}
