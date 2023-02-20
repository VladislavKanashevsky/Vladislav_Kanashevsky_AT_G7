package homework.day2;


public class CycleTaskRunner {

    public static class TestCycleTaskWhile {

        public static void main(String[] args) {

            CycleTaskRunner cycleTaskRunner = new CycleTaskRunner();
            cycleTaskRunner.processCycleTaskWhile();
            System.out.println();
            cycleTaskRunner.processCycleTaskFor();
            System.out.println();
            cycleTaskRunner.processCycleTaskArray();
            System.out.println();
            cycleTaskRunner.processCycleTaskArrayTwo();
            System.out.println();
            cycleTaskRunner.processCycleTaskArrayThree();
            System.out.println();
            cycleTaskRunner.processCycleTaskArrayFour();
            System.out.println();
            cycleTaskRunner.processCycleTaskArrayFive();
            System.out.println();
            cycleTaskRunner.processCycleTaskArraySix();
            System.out.println();
            cycleTaskRunner.processCycleTaskArraySeven();
        }
    }

    public void processCycleTaskWhile() {
        new CycleTaskWhile().printCycleTaskWhile();
    }

    public void processCycleTaskFor() {
        new CycleTaskFor().printCycleTaskFor();
    }

    public void processCycleTaskArray() {
        new CycleTaskArray().printCycleTaskArray();
    }

    public void processCycleTaskArrayTwo() {
        new CycleTaskArrayTwo().printCycleTaskArrayTwo();
    }

    public void processCycleTaskArrayThree() {
        new CycleTaskArrayThree().printCycleTaskArrayThree();
    }

    public void processCycleTaskArrayFour() {
        new CycleTaskArrayFour().printCycleTaskArrayFour();
    }

    public void processCycleTaskArrayFive() {
        new CycleTaskArrayFive().printCycleTaskArrayFive();
    }

    public void processCycleTaskArraySix() {
        new CycleTaskArraySix().printCycleTaskArraySix();
    }

    public void processCycleTaskArraySeven() {
        new CycleTaskArraySeven().printCycleTaskArraySeven();
    }
}

