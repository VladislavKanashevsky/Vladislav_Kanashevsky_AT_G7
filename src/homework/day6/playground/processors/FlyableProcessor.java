package day6.playground.processors;

import day6.playground.essence.Flyable;
import day6.playground.utils.DirectionGenerator;


public class FlyableProcessor {

    public void runFlyable(Flyable flyable) {
        flyable.fly(DirectionGenerator.generateDirection());
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);

    }
}
