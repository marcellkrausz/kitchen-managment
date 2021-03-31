package kitchenmanagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Ingredient {
    MEAT,
    POTATO,
    CARROT;

    private static final List<Ingredient> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Ingredient randomIngredient() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
