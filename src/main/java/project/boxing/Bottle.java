package boxing;

import composition.Bubble;
import composition.SparklingWater;

public class Bottle {
    double volume;
    SparklingWater water;

    public Bottle(double volume) {
        this.volume = volume;
        this.water = new SparklingWater();
        Bubble[] bubbles = new Bubble[(int) (10000 * volume)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble();
        }
        water.pump(bubbles);
    }

    public void open() {
        water.degas();
    }
}
