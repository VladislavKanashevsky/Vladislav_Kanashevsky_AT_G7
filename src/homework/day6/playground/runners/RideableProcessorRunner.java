package day6.playground.runners;

import day6.playground.essence.craft.Rideable;
import day6.playground.essence.craft.field.Car;
import day6.playground.essence.craft.field.Moped;
import day6.playground.essence.craft.field.Motorbike;
import day6.playground.essence.craft.field.Vehicle;
import day6.playground.processors.RideableProcessor;

public class RideableProcessorRunner {

    public static void main(String[] args) {

        RideableProcessor rideableProcessor = new RideableProcessor();

        Rideable rideableCar = new Car(223, "Lada Rideable");
        Rideable rideableMoped = new Moped(3452, "Honda EM1 837 Rideable");
        Rideable rideableMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Rideable");
        Vehicle vehicleCar = new Car(223, "Lada Vehicle");
        Vehicle vehicleMoped = new Moped(3452, "Honda EM1 837 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Vehicle");
        Car aCar = new Car(223, "Lada Car");
        Moped aMoped = new Moped(3452, "Honda EM1 837 Moped");
        Motorbike aMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Motorbike");
        Vehicle anonymousVehicle = new Vehicle(3452, "Honda EM1 837 Vehicle") {

            Rideable anonymousRideable = new Rideable() {
                String name = "Anonymous";

                @Override
                public void drive(String direction) {
                    System.out.printf("I am %s, my name is %s and I amd drive to %s%n",
                            this.getClass().getSimpleName(), this.name, direction);
                }

                @Override
                public String getName() {
                    return null;
                }
            };

            @Override
            public int move(int pointA, int pointB) {
                return super.move(pointA, pointB);
            }

            @Override
            public void move(int generateCoordinate) {

            }

            @Override
            public void drive(String direction) {
                super.drive(direction);
            }
        };

        rideableProcessor.runRideable(rideableCar);
        System.out.println();
        rideableProcessor.runRideable(rideableMoped);
        System.out.println();
        rideableProcessor.runRideable(rideableMotorbike);
        System.out.println();
        rideableProcessor.runRideable(vehicleCar);
        System.out.println();
        rideableProcessor.runRideable(vehicleMoped);
        System.out.println();
        rideableProcessor.runRideable(vehicleMotorbike);
        System.out.println();
        rideableProcessor.runRideable(aCar);
        System.out.println();
        rideableProcessor.runRideable(aMoped);
        System.out.println();
        rideableProcessor.runRideable(aMotorbike);
        System.out.println();
        rideableProcessor.runRideable(anonymousVehicle);
        System.out.println();

        rideableProcessor.runRideable(rideableCar, "nowhere");
        System.out.println();
        rideableProcessor.runRideable(rideableMoped, "everywhere");
        System.out.println();
    }
}
