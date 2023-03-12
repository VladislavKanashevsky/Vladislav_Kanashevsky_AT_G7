package day8;

public class GenericContainerRunner {
    public static void main(String[] args) {

        GenericContainer<Integer,String,Double> container = new GenericContainer<>();

        for (int i = 0; i < 10; i++) {
            container.add(i);
        }



        while (!container.isEmpty()) {
            int integer = container.removeLast();
            System.out.println("Number " + integer );
        }
    }
}
