package day8;

import day6.playground.essence.Flyable;
import day6.playground.essence.Matter;
import day6.playground.essence.craft.Rideable;
import day6.playground.essence.craft.Transportable;
import day6.playground.essence.craft.air.Aircraft;
import day6.playground.essence.craft.air.Copter;
import day6.playground.essence.craft.air.Plane;
import day6.playground.essence.craft.air.Rocket;
import day6.playground.essence.craft.field.Car;
import day6.playground.essence.craft.field.Moped;
import day6.playground.essence.craft.field.Motorbike;
import day6.playground.essence.craft.field.Vehicle;
import day6.playground.essence.craft.hand.*;
import day6.playground.essence.creatures.*;
import day6.playground.essence.material.*;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, Integer> stringIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> stringDoubleGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> integerIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Copter, Integer> copterIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plane, Integer> planeIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rocket, Integer> rocketIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Car, Integer> carIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Moped, Integer> mopedIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Motorbike, Integer> motorbikeIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Integer> bottleIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Can, Integer> canIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mug, Integer> mugIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Beetle, Integer> beetleIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Integer> carrotIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Chamomile, Integer> chamomileIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Integer> crocodileIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Fly, Integer> flyIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Maylily, Integer> maylilyIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mosquito, Integer> mosquitoIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Integer> pigeonIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Potato, Integer> potatoIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Radish, Integer> radishIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Raven, Integer> ravenIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rose, Integer> roseIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Diesel, Integer> dieselIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Petrol, Integer> petrolIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Water, Integer> waterIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();

        Aircraft aircraft = new Aircraft(1, "Aircraft") {
        };
        Copter copter = new Copter(1, "Copter");
        Plane plane = new Plane(1, "Plane");
        Rocket rocket = new Rocket(1, "Rocket");
        Car car = new Car(1, "Car");
        Moped moped = new Moped(1, "Moped");
        Motorbike motorbike = new Motorbike(1, "Motorbike");
        Vehicle vehicle = new Vehicle(1, "Vehicle") {
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
        Bottle bottle = new Bottle(1, "Bottle");
        Can can = new Can(1, "Can");
        Container container = new Container(1, "Container") {
        };
        Mug mug = new Mug(1, "Mug");
        Storable storable = new Storable() {
        };
        Rideable rideable = new Rideable() {
            @Override
            public void drive(String direction) {
            }

            @Override
            public String getName() {
                return null;
            }
        };
        Transportable transportable = new Transportable() {
            @Override
            public int move(int pointA, int pointB) {
                return 0;
            }

            @Override
            public void move(int generateCoordinate) {

            }

            @Override
            public String getName() {
                return null;
            }
        };
        Animal animal = new Animal(1, "Animal") {
        };
        Beetle beetle = new Beetle(1, "Beetle");
        Carrot carrot = new Carrot(1, "Carrot");
        Chamomile chamomile = new Chamomile(1, "Chamomile");
        Crawlable crawlable = new Crawlable() {
            @Override
            public void crawl(String direction, int distance) {
            }

            @Override
            public String getName() {
                return null;
            }
        };
        Crocodile crocodile = new Crocodile(1, "Crocodile");
        Flowers flower = new Flowers(1, "Flower") {
        };
        Fly fly = new Fly(1, "Fly");
        Insect insect = new Insect(1, "Insect") {
        };
        Maylily maylily = new Maylily(1, "Maylily");
        Mosquito mosquito = new Mosquito(1, "Mosquito");
        Pigeon pigeon = new Pigeon(1, "Pigeon");
        Plant plant = new Plant(1, "Plant") {
        };
        Potato potato = new Potato(1, "Potato");
        Radish radish = new Radish(1, "Radish");
        Raven raven = new Raven(1, "myRaven");
        Rose rose = new Rose(1, "Rose");
        Vegetables vegetable = new Vegetables(1, "Vegetable") {
        };
        Vertebrata vertebrata = new Vertebrata(1, "Vertebrata") {
        };
        Diesel diesel = new Diesel();
        Petrol petrol = new Petrol();
        Pourable pourable = new Pourable() {
        };
        Powerable powerable = new Powerable() {
        };
        Water water = new Water();
        Flyable flyable = new Flyable() {
            @Override
            public void fly(String direction) {
            }

            @Override
            public String getName() {
                return null;
            }
        };
        Matter matter = new Matter() {
        };


        System.out.println(stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs("stringInteger"));
        System.out.println(stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs("stringInteger", 1));
        stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("stringDouble", "stringInteger");
        stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("stringInteger", 1, "stringInteger");
        stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("stringInteger", 1);
        System.out.println();

        System.out.println(stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodGenArgs("stringDouble"));
        System.out.println(stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodGenArgs("stringDouble", 2.2));
        stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("string", "string");
        stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("stringDouble", 2.2, "stringDouble");
        stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("stringDouble", 2.2);
        System.out.println();

        System.out.println(integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(1));
        System.out.println(integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(1, 2));
        integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(1, "integer");
        integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(1, 2, "integer");
        integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("integer", 1);
        System.out.println();

        System.out.println(copterIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(copter));
        System.out.println(copterIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(copter, 1));
        copterIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(copter, "copter");
        copterIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(copter, 1, "copter");
        copterIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("copter", 1);
        System.out.println();

        System.out.println(planeIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(plane));
        System.out.println(planeIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(plane, 2));
        planeIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(plane, "plane");
        planeIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(plane, 2, "plane");
        planeIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("plane", 2);
        System.out.println();

        System.out.println(rocketIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(rocket));
        System.out.println(rocketIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(rocket, 3));
        rocketIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(rocket, "rocket");
        rocketIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(rocket, 3, "rocket");
        rocketIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("rocket", 3);
        System.out.println();

        System.out.println(carIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(car));
        System.out.println(carIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(car, 4));
        carIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(car, "car");
        carIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(car, 4, "car");
        carIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("car", 4);
        System.out.println();

        System.out.println(mopedIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(moped));
        System.out.println(mopedIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(moped, 5));
        mopedIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(moped, "moped");
        mopedIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(moped, 5, "moped");
        mopedIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("moped", 5);
        System.out.println();

        System.out.println(motorbikeIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(motorbike));
        System.out.println(motorbikeIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(motorbike, 6));
        motorbikeIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(motorbike, "motorbike");
        motorbikeIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(motorbike, 6, "motorbike");
        motorbikeIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("motorbike", 6);
        System.out.println();

        System.out.println(bottleIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(bottle));
        System.out.println(bottleIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(bottle, 7));
        bottleIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(bottle, "bottle");
        bottleIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(bottle, 7, "bottle");
        bottleIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("bottle", 7);
        System.out.println();

        System.out.println(canIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(can));
        System.out.println(canIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(can, 8));
        canIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(can, "can");
        canIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(can, 8, "can");
        canIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("can", 8);
        System.out.println();

        System.out.println(mugIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(mug));
        System.out.println(mugIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(mug, 9));
        mugIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(mug, "mug");
        mugIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(mug, 9, "mug");
        mugIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("mug", 9);
        System.out.println();

        System.out.println(beetleIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(beetle));
        System.out.println(beetleIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(beetle, 10));
        beetleIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(beetle, "beetle");
        beetleIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(beetle, 10, "beetle");
        beetleIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("beetle", 10);
        System.out.println();

        System.out.println(carrotIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(carrot));
        System.out.println(carrotIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(carrot, 11));
        carrotIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(carrot, "carrot");
        carrotIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(carrot, 11, "carrot");
        carrotIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("carrot", 11);
        System.out.println();

        System.out.println(chamomileIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(chamomile));
        System.out.println(chamomileIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(chamomile, 12));
        chamomileIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(chamomile, "chamomile");
        chamomileIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(chamomile, 12, "chamomile");
        chamomileIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(chamomile, 12, "chamomile");
        System.out.println();

        System.out.println(crocodileIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(crocodile));
        System.out.println(crocodileIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(crocodile, 13));
        crocodileIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(crocodile, "crocodile");
        crocodileIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(crocodile, 13, "crocodile");
        crocodileIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("crocodile", 13);
        System.out.println();

        System.out.println(flyIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(fly));
        System.out.println(flyIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(fly, 14));
        flyIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(fly, "fly");
        flyIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(fly, 14, "fly");
        flyIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("fly", 14);
        System.out.println();

        System.out.println(maylilyIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(maylily));
        System.out.println(maylilyIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(maylily, 15));
        maylilyIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(maylily, "maylily");
        maylilyIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(maylily, 15, "maylily");
        maylilyIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("mayluly", 15);
        System.out.println();

        System.out.println(mosquitoIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(mosquito));
        System.out.println(mosquitoIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(mosquito, 16));
        mosquitoIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(mosquito, "mosquito");
        mosquitoIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(mosquito, 16, "mosquito");
        mosquitoIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("mosquito", 16);
        System.out.println();

        System.out.println(pigeonIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(pigeon));
        System.out.println(pigeonIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(pigeon, 17));
        pigeonIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(pigeon, "pigeon");
        pigeonIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(pigeon, 17, "pigeon");
        pigeonIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("pigeon", 17);
        System.out.println();

        System.out.println(potatoIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(potato));
        System.out.println(potatoIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(potato, 18));
        potatoIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(potato, "potato");
        potatoIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(potato, 18, "potato");
        potatoIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("potato", 18);
        System.out.println();

        System.out.println(radishIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(radish));
        System.out.println(radishIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(radish, 19));
        radishIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(radish, "radish");
        radishIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(radish, 19, "radish");
        radishIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("radish", 19);
        System.out.println();

        System.out.println(ravenIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(raven));
        System.out.println(ravenIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(raven, 20));
        ravenIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(raven, "raven");
        ravenIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(raven, 20, "raven");
        ravenIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("raven", 20);
        System.out.println();

        System.out.println(roseIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(rose));
        System.out.println(roseIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(rose, 21));
        roseIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(rose, "rose");
        roseIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(rose, 21, "rose");
        roseIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("rose", 21);
        System.out.println();

        System.out.println(dieselIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(diesel));
        System.out.println(dieselIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(diesel, 22));
        dieselIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(diesel, "diesel");
        dieselIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(diesel, 22, "diesel");
        dieselIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("diesel", 22);
        System.out.println();

        System.out.println(petrolIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(petrol));
        System.out.println(petrolIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(petrol, 23));
        petrolIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(petrol, "petrol");
        petrolIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(petrol, 23, "petrol");
        petrolIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("petrol", 23);
        System.out.println();

        System.out.println(waterIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(water));
        System.out.println(waterIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(water, 24));
        waterIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(water, "water");
        waterIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(water, 24, "water");
        waterIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("water", 24);
        System.out.println();
    }
}