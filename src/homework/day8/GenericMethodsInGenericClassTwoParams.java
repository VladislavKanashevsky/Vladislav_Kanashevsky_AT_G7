package day8;

public class GenericMethodsInGenericClassTwoParams<X, Y> {


    public Object genericMethodGenArgs(X typeOne) {
        return ("I received " + 1 + " arguments of type: " + typeOne + " class");
    }

    public Object genericMethodGenArgs(X typeTwo, Y typeThree) {
        return ("I received " + 2 + " arguments of type: " + typeTwo.getClass().getSimpleName() + " class, " + typeThree.getClass().getSimpleName() + " class");
    }

    public void genericMethodHalfGenArgs(X typeFour, String string) {
        System.out.println("I got an object of " + typeFour.getClass().getSimpleName() + " class and string with " + string.length() + " characters");
    }

    public void genericMethodHalfGenArgs(X typeFour, Y typeSix, String stringTwo) {
        System.out.println("I got an object of " + typeFour.getClass().getSimpleName() + " class and " + typeSix + " class and string with " + stringTwo.length() + " characters");
    }

    public void genericMethodHalfGenArgs(String stringThree, Y typeSeven) {
        System.out.println("I got an object of " + typeSeven.getClass().getSimpleName() + " class and string with " + stringThree.length() + " characters");
    }

}