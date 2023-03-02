package day6.playground.runners;

import day6.playground.essence.Flyable;
import day6.playground.essence.craft.air.Aircraft;
import day6.playground.essence.craft.air.Copter;
import day6.playground.essence.craft.air.Plane;
import day6.playground.essence.craft.air.Rocket;
import day6.playground.essence.creatures.Fly;
import day6.playground.essence.creatures.Insect;
import day6.playground.essence.creatures.Mosquito;
import day6.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {

    public static void main(String[] args) {

        FlyableProcessor flyableProcessor = new FlyableProcessor();

        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        flyableProcessor.runFlyable(flyableCopter);
        System.out.println();
        flyableProcessor.runFlyable(flyablePlane);
        System.out.println();
        flyableProcessor.runFlyable(flyableRocket);
        System.out.println();
        flyableProcessor.runFlyable(flyableFly);
        System.out.println();
        flyableProcessor.runFlyable(flyableMosquito);
        System.out.println();
        flyableProcessor.runFlyable(aircraftCopter);
        System.out.println();
        flyableProcessor.runFlyable(aircraftPlane);
        System.out.println();
        flyableProcessor.runFlyable(aircraftRocket);
        System.out.println();
        flyableProcessor.runFlyable(insectFly);
        System.out.println();
        flyableProcessor.runFlyable(insectMosquito);
        System.out.println();
        flyableProcessor.runFlyable(aCopter);
        System.out.println();
        flyableProcessor.runFlyable(aPlane);
        System.out.println();
        flyableProcessor.runFlyable(aRocket);
        System.out.println();
        flyableProcessor.runFlyable(aFly);
        System.out.println();
        flyableProcessor.runFlyable(aMosquito);
        System.out.println();

        flyableProcessor.runFlyable(flyableCopter, "nowhere");
        System.out.println();
        flyableProcessor.runFlyable(flyablePlane, "everywhere");

    }
}
