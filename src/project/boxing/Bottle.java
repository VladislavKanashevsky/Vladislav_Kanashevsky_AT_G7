package boxing;

import composition.Bubble;
import composition.SparklingWater;
import composition.Water;

public class Bottle {
    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
        SparklingWater sparklingWater = new SparklingWater();
        Bubble[] bubbles = new Bubble[(int) (10 * volume)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble(" ");
        }

        sparklingWater.pump(bubbles);
        sparklingWater.isSparkle();
        this.water = sparklingWater;
    }

    public void open() {
        this.water.open();
    }

    public void warm(int temperature) {
        water.setTemperature(5);
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}
