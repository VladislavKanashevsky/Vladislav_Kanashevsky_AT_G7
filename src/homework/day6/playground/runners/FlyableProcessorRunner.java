package day6.playground.runners;

import day6.playground.essence.Flyable;
import day6.playground.essence.craft.air.AirCraft;
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
        AirCraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        AirCraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        AirCraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");


        flyableProcessor.runFlyable(flyableCopter);
        flyableProcessor.runFlyable(flyablePlane);
        flyableProcessor.runFlyable(flyableRocket);
        flyableProcessor.runFlyable(flyableFly);
        flyableProcessor.runFlyable(flyableMosquito);
        flyableProcessor.runFlyable(aircraftCopter);
        flyableProcessor.runFlyable(aircraftPlane);
        flyableProcessor.runFlyable(aircraftRocket);
        flyableProcessor.runFlyable(insectFly);
        flyableProcessor.runFlyable(insectMosquito);
        flyableProcessor.runFlyable(aCopter);
        flyableProcessor.runFlyable(aPlane);
        flyableProcessor.runFlyable(aRocket);
        flyableProcessor.runFlyable(aFly);
        flyableProcessor.runFlyable(aMosquito);

        flyableProcessor.runFlyable(flyableCopter, "nowhere");
        flyableProcessor.runFlyable(flyablePlane, "everywhere");
    }
}
