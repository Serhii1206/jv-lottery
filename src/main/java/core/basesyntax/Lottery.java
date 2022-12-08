package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUNBER_BALLS = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUNBER_BALLS));
    }
}