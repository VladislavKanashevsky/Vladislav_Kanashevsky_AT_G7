package homework.day1;

public class TrainMethodsPrimitive {

    public static class TrainMethodsPrimitiveRunner {
        public static void main(String[] args) {
            TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
            trainMethodsPrimitive.printInt(2);
            trainMethodsPrimitive.printLong(999999999);
            trainMethodsPrimitive.printChar('a');
            trainMethodsPrimitive.printFloat(7.77F);
            trainMethodsPrimitive.printDouble(9.99);
            trainMethodsPrimitive.printShort((short) 8);
            trainMethodsPrimitive.printByte((byte) 4);
            trainMethodsPrimitive.printBoolean(true);
        }
    }

    public void printInt(int integer) {
        System.out.println("Я получил на вход число" + integer);
    }

    public void printLong(long integer2) {
        System.out.println("я получил на вход  длинное число" + integer2);
    }

    public void printChar(char symbol) {
        System.out.println("я получил на вход символ" + symbol);
    }

    public void printFloat(Float fraction) {
        System.out.println("я получил на вход дробное число " + fraction);
    }

    public void printDouble(double fraction2) {
        System.out.println("я получил на вход длинное дробное число " + fraction2);
    }

    public void printShort(short integer3) {
        System.out.println("я получил на вход короткое число " + integer3);
    }

    public void printByte(byte integer4) {
        System.out.println("я получил на вход очень короткое число " + integer4);
    }

    public void printBoolean(boolean isActive) {
        System.out.println("я получил на вход булево " + isActive);
    }

}
