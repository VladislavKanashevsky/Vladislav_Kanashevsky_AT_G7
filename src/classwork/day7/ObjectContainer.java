package day7;

public class ObjectContainer {

    Object[] array = new Object[10];

    int counter = 0;

    public void add(Object incoming) {
        if (counter < array.length) {
            array[counter++] = incoming;
        }
    }

    public Object removeLast() {

        Object objectLast = null;

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
