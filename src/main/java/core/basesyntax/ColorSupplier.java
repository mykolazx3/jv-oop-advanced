package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random = new Random();

    public String getRandomColor() {
        final int amountOfColors = Color.values().length;
        int index = random.nextInt(amountOfColors);
        return Color.values()[index].name();
    }
}
