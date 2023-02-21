package day1;

public class TrainMethodsReturn {

    public static class TrainMethodsReturnRunner {
        public static void main(String[] args) {
            TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
            System.out.println("Метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(4));
            System.out.println();
            System.out.println("Метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(999999999));
            System.out.println();
            System.out.println("Метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('d'));
            System.out.println();
            System.out.println("Метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(7.77F));
            System.out.println();
            System.out.println("Метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(8.88));
            System.out.println();
            System.out.println("Метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short) 5));
            System.out.println();
            System.out.println("Метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 8));
            System.out.println();
            System.out.println("Метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(true));
            System.out.println();
        }
    }

    public int returnNewInt(int number) {
        return number * 3;
    }


    public long returnNewLong(long number2) {
        return number2 - 4;
    }

    public char returnNewChar(char symbol2) {
        return symbol2;
    }

    public float returnNewFloat(float fraction3) {
        return fraction3 / 2;
    }

    public double returnNewDouble(double fraction4) {
        return fraction4 + 8;
    }

    public short returnNewShort(short number3) {
        return (short) (number3 - 1);
    }

    public byte returnNewByte(byte number4) {
        return (byte) (number4 * 2);
    }

    public boolean returnNewBoolean(boolean isActive2) {
        if (isActive2) {
            return true;
        } else {
            return false;
        }
    }
}
