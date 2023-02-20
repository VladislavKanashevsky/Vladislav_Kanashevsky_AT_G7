package homework.day2;


public class CycleTaskRunner {

    public static class TestCycleTaskWhile {
        public static void main(String[] args) {
            CycleTaskRunner cycleTaskRunner = new CycleTaskRunner();
            cycleTaskRunner.processCycleTaskWhile(new CycleTaskWhile());
            System.out.println();
            cycleTaskRunner.processCycleTaskFor(new CycleTaskFor());
            System.out.println();
            cycleTaskRunner.processCycleTaskArray(new CycleTaskArray());
            System.out.println();
            cycleTaskRunner.processCycleTaskArrayTwo(new CycleTaskArrayTwo());
            System.out.println();
            cycleTaskRunner.processCycleTaskArrayThree(new CycleTaskArrayThree());
            System.out.println();
            cycleTaskRunner.processCycleTaskArrayFour(new CycleTaskArrayFour());
            System.out.println();
            cycleTaskRunner.processCycleTaskArrayFive(new CycleTaskArrayFive());
            System.out.println();
            cycleTaskRunner.processCycleTaskArraySix(new CycleTaskArraySix());
            System.out.println();
            cycleTaskRunner.processCycleTaskArraySeven(new CycleTaskArraySeven());
        }
    }

    public void processCycleTaskWhile(CycleTaskWhile cycleTaskWhile) {
        cycleTaskWhile.printCycleTaskWhile();
    }

    public void processCycleTaskFor(CycleTaskFor cycleTaskFor) {
        cycleTaskFor.printCycleTaskFor();
    }

    public void processCycleTaskArray(CycleTaskArray cycleTaskArray) {

        cycleTaskArray.printCycleTaskArray();

    }

    public void processCycleTaskArrayTwo(CycleTaskArrayTwo cycleTaskArrayTwo) {

        cycleTaskArrayTwo.printCycleTaskArrayTwo();

    }

    public void processCycleTaskArrayThree(CycleTaskArrayThree cycleTaskArrayThree) {
        cycleTaskArrayThree.printCycleTaskArrayThree();
    }

    public void processCycleTaskArrayFour(CycleTaskArrayFour cycleTaskArrayFour) {
        cycleTaskArrayFour.printCycleTaskArrayFour();
    }

    public void processCycleTaskArrayFive(CycleTaskArrayFive cycleTaskArrayFive) {
        cycleTaskArrayFive.printCycleTaskArrayFive();
    }

    public void processCycleTaskArraySix(CycleTaskArraySix cycleTaskArraySix) {
        cycleTaskArraySix.printCycleTaskArraySix();
    }

    public void processCycleTaskArraySeven(CycleTaskArraySeven cycleTaskArraySeven) {
        cycleTaskArraySeven.printCycleTaskArraySeven();
    }
}

