package homework.day1;

public class TrainMethodsIf {

    public static class TrainMethodsIfRunner {
        public static void main(String[] args) {
            TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
            System.out.println("Метод returnNewInt вернул " + trainMethodsIf.returnNewInt(6));
            System.out.println();
            System.out.println("Метод returnNewLong вернул " + trainMethodsIf.returnNewLong(10000));
            System.out.println();
            System.out.println("Метод returnNewChar вернул " + trainMethodsIf.returnNewChar('g'));
            System.out.println();
            System.out.println("Метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat(0.67F));
            System.out.println();
            System.out.println("Метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(444));
            System.out.println();
            System.out.println(returnNewBoolean(false));
            System.out.println();
        }
    }

    public int returnNewInt(int number5) {
        if (number5 < 8) {
            return number5 * 7;
        } else {
            return number5 / 2;
        }
    }

    public long returnNewLong(long number6) {
        if (number6 > 300) {
            return number6 - 300;
        } else {
            return number6 + 20;
        }
    }

    public String returnNewChar(char symbol3) {
        if (symbol3 == 'g') {
            return "go";
        } else {
            return "o";
        }
    }

    public float returnNewFloat(float fraction5) {
        if (fraction5 == 0.67) {
            return fraction5;
        } else {
            return fraction5 * 2;
        }
    }

    public double returnNewDouble(double fraction6) {
        if (fraction6 > 30 && fraction6 < 80) {
            return fraction6 + 87;
        }
        if (fraction6 > 80 && fraction6 < 400) {
            return fraction6 - 87;
        }
        if (fraction6 > 400) {
            return fraction6 / 4;
        }
        return fraction6;
    }

    public static boolean returnNewBoolean(boolean isActive3) {
        if (isActive3) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
        return isActive3;
    }
}

