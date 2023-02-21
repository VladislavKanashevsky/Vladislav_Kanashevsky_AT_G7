package day1;

public class TrainMethodsObjects {

    public static class TrainMethodsObjectsRunner {
        public static void main(String[] args) {

            TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
            System.out.println();
            trainMethodsObjects.processMouse(new Mouse());
            System.out.println();
            trainMethodsObjects.processSouse(new Souse());
            System.out.println();
            trainMethodsObjects.processBee(new Bee());
            System.out.println();
            trainMethodsObjects.processObstacle(new Obstacle());
            System.out.println();
            trainMethodsObjects.processPineapple(new Pineapple());
        }
    }

    public void processMouse(Mouse mouse) {
        System.out.println(mouse.getName() + " " + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouse(Souse souse) {
        System.out.println(souse.getName() + " " + souse.getColor());
        souse.printSouseDetails();
    }

    public void processBee(Bee bee) {
        System.out.println(bee.getGender() + " " + bee.getWeight());
        bee.printBeeDetails();

    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println(obstacle.getDescription() + " " + obstacle.getSeverity());
        obstacle.printObstacleDetails();

    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple.getGrade() + " " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();

    }
}
