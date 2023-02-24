package composition;


public class SparklingWater extends Water {

    private boolean isOpened;

    private Bubble[] bubbles;

    public SparklingWater() {
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        if (isOpened) {
            System.out.println("This bottle is open");
        } else {
            System.out.println("This bottle is close");
        }
    }

    private void isOpened() {
        if (isOpened) {
            degas();
        }
    }


    private void degas() {
        int lastCrampedBubbleIndex = 0;
        while (isSparkle()) {
            for (int i = lastCrampedBubbleIndex; i < lastCrampedBubbleIndex + 10 + 5 * getTemperature(); i++) {
                if (


                }
            }
        }
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
                bubbles[i].cramp();
                bubbles[i] = null;
            }
        }
    }

    public boolean isSparkle() {
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void open() {
        setOpened(true);
    }
}
