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

        stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg("stringInteger");
        System.out.println(stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs("stringInteger", 1));
        stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("stringDouble", "stringInteger");
        System.out.println();
        stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg("stringDouble");
        System.out.println(stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs("stringDouble", 2.2));
        stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs("string", "string");
        System.out.println();
        integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(1);
        System.out.println(integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(1, 2));
        integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(1, " integer");
        System.out.println();
        copterIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(copter);
        System.out.println(copterIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(copter, 1));
        copterIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(copter, "copter");
        System.out.println();
        planeIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(plane);
        System.out.println(planeIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(plane, 2));
        planeIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(plane, "plane");
        System.out.println();
        rocketIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(rocket);
        System.out.println(rocketIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(rocket, 3));
        rocketIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(rocket, "rocket");
        System.out.println();
        carIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(car);
        System.out.println(carIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(car, 4));
        carIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(car, "car");
        System.out.println();
        mopedIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(moped);
        System.out.println(mopedIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(moped, 5));
        mopedIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(moped, "moped");
        System.out.println();
        motorbikeIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(motorbike);
        System.out.println(motorbikeIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(motorbike, 6));
        motorbikeIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(motorbike, "motorbike");
        System.out.println();
        bottleIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(bottle);
        System.out.println(bottleIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(bottle, 7));
        bottleIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(bottle, "bottle");
        System.out.println();
        canIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(can);
        System.out.println(canIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(can, 8));
        canIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(can, "can");
        System.out.println();
        mugIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(mug);
        System.out.println(mugIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(mug, 9));
        mugIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(mug, "mug");
        System.out.println();
        beetleIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(beetle);
        System.out.println(beetleIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(beetle, 10));
        beetleIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(beetle, "beetle");
        System.out.println();
        carrotIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(carrot);
        System.out.println(carrotIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(carrot, 11));
        carrotIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(carrot, "carrot");
        System.out.println();
        chamomileIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(chamomile);
        System.out.println(chamomileIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(chamomile, 12));
        chamomileIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(chamomile, "chamomile");
        System.out.println();
        crocodileIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(crocodile);
        System.out.println(crocodileIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(crocodile, 13));
        crocodileIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(crocodile, "crocodile");
        System.out.println();
        flyIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(fly);
        System.out.println(flyIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(fly, 14));
        flyIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(fly, "fly");
        System.out.println();
        maylilyIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(maylily);
        System.out.println(maylilyIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(maylily, 15));
        maylilyIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(maylily, "maylily");
        System.out.println();
        mosquitoIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(mosquito);
        System.out.println(mosquitoIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(mosquito, 16));
        mosquitoIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(mosquito, "mosquito");
        System.out.println();
        pigeonIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(pigeon);
        System.out.println(pigeonIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(pigeon, 17));
        pigeonIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(pigeon, "pigeon");
        System.out.println();
        potatoIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(potato);
        System.out.println(potatoIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(potato, 18));
        potatoIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(potato, "potato");
        System.out.println();
        radishIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(radish);
        System.out.println(radishIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(radish, 19));
        radishIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(radish, "radish");
        System.out.println();
        ravenIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(raven);
        System.out.println(ravenIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(raven, 20));
        ravenIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(raven, "raven");
        System.out.println();
        roseIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(rose);
        System.out.println(roseIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(rose, 21));
        roseIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(rose, "rose");
        System.out.println();
        dieselIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(diesel);
        System.out.println(dieselIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(diesel, 22));
        dieselIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(diesel, "diesel");
        System.out.println();
        petrolIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(petrol);
        System.out.println(petrolIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(petrol, 23));
        petrolIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(petrol, "petrol");
        System.out.println();
        waterIntegerGenericMethodsInGenericClassTwoParams.genericMethodOneGenArg(water);
        System.out.println(waterIntegerGenericMethodsInGenericClassTwoParams.genericMethodTwoGenArgs(water, 24));
        waterIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(water, "water");
        System.out.println();
    }
}