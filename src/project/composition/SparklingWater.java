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
        int batch = 10 + 5 * getTemperature();
        while (isSparkle()) {
            int s = lastCrampedBubbleIndex + batch >= bubbles.length ? bubbles.length : lastCrampedBubbleIndex + batch;
            for (int i = lastCrampedBubbleIndex; i < s; i++) {
                if (bubbles[i] != null) {
                    bubbles[i].cramp();
                    bubbles[i] = null;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lastCrampedBubbleIndex = lastCrampedBubbleIndex + batch;
        }
    }

    public boolean isSparkle() {
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void open() {
        setOpened(true);
        degas();
    }
}
