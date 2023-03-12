package day8;

public class GenericContainer<X, Y, Z> {

    private X[] array = (X[]) new Object[10];
    private int counter = 0;

    public void add(X o) {
        if (counter < array.length) {
            array[counter++] = o;
        }
    }

    public X removeLast() {

        X objectLast = null;

        if (counter != 0) {
            objectLast = array[counter - 1];
            array[counter-- - 1] = null;
        }
        return objectLast;
    }

    public boolean isEmpty() {
        return counter == 0;
    }
}
