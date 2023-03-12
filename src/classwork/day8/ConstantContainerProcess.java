package day8;

public class ConstantContainerProcess {

    public static void printColor(String color) {
        if (color.equals(ConstantContainer.RED)) {
            System.out.println("This color is red");
        } else if (color.equals(ConstantContainer.BLUE)) {
            System.out.println("This color is blue");
        } else if (color.equals(ConstantContainer.GREEN)) {
            System.out.println("This color is green");
        } else if (color.equals(ConstantContainer.YELLOW)) {
            System.out.println("This color is yellow");
        } else if (color.equals(ConstantContainer.PURPLE)) {
            System.out.println("This color is purple");
        }
    }

   /* public static void printColorTwo(String color) {
        String result=color;
        switch (result){
            case ConstantContainer.RED:
                System.out.println(ConstantContainer.RED);
                break;
            case ConstantContainer.BLUE:
                System.out.println(ConstantContainer.BLUE);
                break;
            case ConstantContainer.GREEN:
                System.out.println(ConstantContainer.GREEN);
                break;
            case ConstantContainer.:
                System.out.println(ConstantContainer.RED);
                break;
            case ConstantContainer.RED:
                System.out.println(ConstantContainer.RED);
                break;
        }
    }*/
}
