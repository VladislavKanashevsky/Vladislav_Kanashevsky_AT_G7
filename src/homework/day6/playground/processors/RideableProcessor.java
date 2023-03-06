package day6.playground.processors;

import day6.playground.essence.craft.Rideable;
import day6.playground.utils.DirectionGenerator;

public class RideableProcessor {

    public void runRideable(Rideable rideable) {
        rideable.drive(DirectionGenerator.generateDirection());
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }
}
