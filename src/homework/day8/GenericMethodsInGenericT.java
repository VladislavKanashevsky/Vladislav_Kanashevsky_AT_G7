package day8;

public class GenericMethodsInGenericT<T> {

    public void genericMethodOneGenArg(T type) {
        System.out.println("I am an object of " + type.getClass().getSimpleName() + " class");
    }

    public String genericMethodTwoGenArgs(T typeTwo, T typeThree) {
        return ("We are objects of " + typeTwo.getClass().getSimpleName() + " class and " + typeThree.getClass().getSimpleName() + " class");
    }

    public void genericMethodHalfGenArgs(T typeFour, String string) {
        System.out.println("I got an object of " + typeFour.getClass().getSimpleName() + " class and string with " + string.length() + " characters");
    }
}
