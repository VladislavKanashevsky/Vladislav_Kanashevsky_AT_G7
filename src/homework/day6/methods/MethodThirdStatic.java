package day6.methods;

public class MethodThirdStatic {
    public static int MethodThirdStaticProcess(String stringAndNumber) {
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int length = 0;

        for (char element : number) {
            for (int i = 0; i < stringAndNumber.length(); i++) {
                if (element == stringAndNumber.charAt(i)) {
                    length++;
                    char[] mass = new char[]{stringAndNumber.charAt(i)};
                    System.out.print(mass);
                }
            }
        }
        return length;
    }
}
