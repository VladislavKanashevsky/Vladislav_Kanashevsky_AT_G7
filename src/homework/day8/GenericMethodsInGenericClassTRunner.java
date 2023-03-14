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

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericT<String> stringGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Integer> integerGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Double> doubleGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Copter> copterGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Plane> planeGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Rocket> rocketGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Car> carGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Moped> mopedGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Motorbike> motorbikeGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Bottle> bottleGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Can> canGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Mug> mugGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Beetle> beetleGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Carrot> carrotGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Chamomile> chamomileGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Crocodile> crocodileGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Fly> flyGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Maylily> maylilyGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Mosquito> mosquitoGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Pigeon> pigeonGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Potato> potatoGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Radish> radishGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Raven> ravenGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Rose> roseGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Diesel> dieselGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Petrol> petrolGenericMethodsInGenericT = new GenericMethodsInGenericT<>();
        GenericMethodsInGenericT<Water> waterGenericMethodsInGenericT = new GenericMethodsInGenericT<>();

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

        System.out.println();
        stringGenericMethodsInGenericT.genericMethodOneGenArg("stringGenericMethodsInGenericT");
        System.out.println(stringGenericMethodsInGenericT.genericMethodTwoGenArgs("stringGenericMethodsInGenericT", "stringGenericMethodsInGenericT"));
        stringGenericMethodsInGenericT.genericMethodHalfGenArgs("stringGenericMethodsInGenericT", "stringGenericMethodsInGenericT");
        System.out.println();
        integerGenericMethodsInGenericT.genericMethodOneGenArg(4);
        System.out.println(integerGenericMethodsInGenericT.genericMethodTwoGenArgs(4, 4));
        integerGenericMethodsInGenericT.genericMethodHalfGenArgs(4, "4");
        System.out.println();
        doubleGenericMethodsInGenericT.genericMethodOneGenArg(4.4);
        System.out.println(doubleGenericMethodsInGenericT.genericMethodTwoGenArgs(4.4, 4.4));
        doubleGenericMethodsInGenericT.genericMethodHalfGenArgs(4.4, "4.4");
        System.out.println();
        copterGenericMethodsInGenericT.genericMethodOneGenArg(copter);
        System.out.println(copterGenericMethodsInGenericT.genericMethodTwoGenArgs(copter, copter));
        copterGenericMethodsInGenericT.genericMethodHalfGenArgs(copter, "copterGenericMethodsInGenericT");
        System.out.println();
        planeGenericMethodsInGenericT.genericMethodOneGenArg(plane);
        System.out.println(planeGenericMethodsInGenericT.genericMethodTwoGenArgs(plane, plane));
        planeGenericMethodsInGenericT.genericMethodHalfGenArgs(plane, "planeGenericMethodsInGenericT");
        System.out.println();
        rocketGenericMethodsInGenericT.genericMethodOneGenArg(rocket);
        System.out.println(rocketGenericMethodsInGenericT.genericMethodTwoGenArgs(rocket, rocket));
        rocketGenericMethodsInGenericT.genericMethodHalfGenArgs(rocket, "rocketGenericMethodsInGenericT");
        System.out.println();
        carGenericMethodsInGenericT.genericMethodOneGenArg(car);
        System.out.println(carGenericMethodsInGenericT.genericMethodTwoGenArgs(car, car));
        carGenericMethodsInGenericT.genericMethodHalfGenArgs(car, "carGenericMethodsInGenericT");
        System.out.println();
        mopedGenericMethodsInGenericT.genericMethodOneGenArg(moped);
        System.out.println(mopedGenericMethodsInGenericT.genericMethodTwoGenArgs(moped, moped));
        mopedGenericMethodsInGenericT.genericMethodHalfGenArgs(moped, "mopedGenericMethodsInGenericT");
        System.out.println();
        motorbikeGenericMethodsInGenericT.genericMethodOneGenArg(motorbike);
        System.out.println(motorbikeGenericMethodsInGenericT.genericMethodTwoGenArgs(motorbike, motorbike));
        motorbikeGenericMethodsInGenericT.genericMethodHalfGenArgs(motorbike, "motorbikeGenericMethodsInGenericT");
        System.out.println();
        bottleGenericMethodsInGenericT.genericMethodOneGenArg(bottle);
        System.out.println(bottleGenericMethodsInGenericT.genericMethodTwoGenArgs(bottle, bottle));
        bottleGenericMethodsInGenericT.genericMethodHalfGenArgs(bottle, "bottleGenericMethodsInGenericT");
        System.out.println();
        canGenericMethodsInGenericT.genericMethodOneGenArg(can);
        System.out.println(canGenericMethodsInGenericT.genericMethodTwoGenArgs(can, can));
        canGenericMethodsInGenericT.genericMethodHalfGenArgs(can, "canGenericMethodsInGenericT");
        System.out.println();
        mugGenericMethodsInGenericT.genericMethodOneGenArg(mug);
        System.out.println(mugGenericMethodsInGenericT.genericMethodTwoGenArgs(mug, mug));
        mugGenericMethodsInGenericT.genericMethodHalfGenArgs(mug, "mugGenericMethodsInGenericT");
        System.out.println();
        beetleGenericMethodsInGenericT.genericMethodOneGenArg(beetle);
        System.out.println(beetleGenericMethodsInGenericT.genericMethodTwoGenArgs(beetle, beetle));
        beetleGenericMethodsInGenericT.genericMethodHalfGenArgs(beetle, "beetleGenericMethodsInGenericT");
        System.out.println();
        carrotGenericMethodsInGenericT.genericMethodOneGenArg(carrot);
        System.out.println(carrotGenericMethodsInGenericT.genericMethodTwoGenArgs(carrot, carrot));
        carrotGenericMethodsInGenericT.genericMethodHalfGenArgs(carrot, "carrotGenericMethodsInGenericT");
        System.out.println();
        chamomileGenericMethodsInGenericT.genericMethodOneGenArg(chamomile);
        System.out.println(chamomileGenericMethodsInGenericT.genericMethodTwoGenArgs(chamomile, chamomile));
        chamomileGenericMethodsInGenericT.genericMethodHalfGenArgs(chamomile, "chamomileGenericMethodsInGenericT");
        System.out.println();
        crocodileGenericMethodsInGenericT.genericMethodOneGenArg(crocodile);
        System.out.println(crocodileGenericMethodsInGenericT.genericMethodTwoGenArgs(crocodile, crocodile));
        crocodileGenericMethodsInGenericT.genericMethodHalfGenArgs(crocodile, "crocodileGenericMethodsInGenericT");
        System.out.println();
        flyGenericMethodsInGenericT.genericMethodOneGenArg(fly);
        System.out.println(flyGenericMethodsInGenericT.genericMethodTwoGenArgs(fly, fly));
        flyGenericMethodsInGenericT.genericMethodHalfGenArgs(fly, "flyGenericMethodsInGenericT");
        System.out.println();
        maylilyGenericMethodsInGenericT.genericMethodOneGenArg(maylily);
        System.out.println(maylilyGenericMethodsInGenericT.genericMethodTwoGenArgs(maylily, maylily));
        maylilyGenericMethodsInGenericT.genericMethodHalfGenArgs(maylily, "maylilyGenericMethodsInGenericT");
        System.out.println();
        mosquitoGenericMethodsInGenericT.genericMethodOneGenArg(mosquito);
        System.out.println(mosquitoGenericMethodsInGenericT.genericMethodTwoGenArgs(mosquito, mosquito));
        mosquitoGenericMethodsInGenericT.genericMethodHalfGenArgs(mosquito, "mosquitoGenericMethodsInGenericT");
        System.out.println();
        pigeonGenericMethodsInGenericT.genericMethodOneGenArg(pigeon);
        System.out.println(pigeonGenericMethodsInGenericT.genericMethodTwoGenArgs(pigeon, pigeon));
        pigeonGenericMethodsInGenericT.genericMethodHalfGenArgs(pigeon, "pigeonGenericMethodsInGenericT");
        System.out.println();
        potatoGenericMethodsInGenericT.genericMethodOneGenArg(potato);
        System.out.println(potatoGenericMethodsInGenericT.genericMethodTwoGenArgs(potato, potato));
        potatoGenericMethodsInGenericT.genericMethodHalfGenArgs(potato, "potatoGenericMethodsInGenericT");
        System.out.println();
        radishGenericMethodsInGenericT.genericMethodOneGenArg(radish);
        System.out.println(radishGenericMethodsInGenericT.genericMethodTwoGenArgs(radish, radish));
        radishGenericMethodsInGenericT.genericMethodHalfGenArgs(radish, "radishGenericMethodsInGenericT");
        System.out.println();
        ravenGenericMethodsInGenericT.genericMethodOneGenArg(raven);
        System.out.println(ravenGenericMethodsInGenericT.genericMethodTwoGenArgs(raven, raven));
        ravenGenericMethodsInGenericT.genericMethodHalfGenArgs(raven, "ravenGenericMethodsInGenericT");
        System.out.println();
        roseGenericMethodsInGenericT.genericMethodOneGenArg(rose);
        System.out.println(roseGenericMethodsInGenericT.genericMethodTwoGenArgs(rose, rose));
        roseGenericMethodsInGenericT.genericMethodHalfGenArgs(rose, "roseGenericMethodsInGenericT");
        System.out.println();
        dieselGenericMethodsInGenericT.genericMethodOneGenArg(diesel);
        System.out.println(dieselGenericMethodsInGenericT.genericMethodTwoGenArgs(diesel, diesel));
        dieselGenericMethodsInGenericT.genericMethodHalfGenArgs(diesel, "dieselGenericMethodsInGenericT");
        System.out.println();
        petrolGenericMethodsInGenericT.genericMethodOneGenArg(petrol);
        System.out.println(petrolGenericMethodsInGenericT.genericMethodTwoGenArgs(petrol, petrol));
        petrolGenericMethodsInGenericT.genericMethodHalfGenArgs(petrol, "petrolGenericMethodsInGenericT");
        System.out.println();
        waterGenericMethodsInGenericT.genericMethodOneGenArg(water);
        System.out.println(waterGenericMethodsInGenericT.genericMethodTwoGenArgs(water, water));
        waterGenericMethodsInGenericT.genericMethodHalfGenArgs(water, "waterGenericMethodsInGenericT");
        System.out.println();
    }
}

