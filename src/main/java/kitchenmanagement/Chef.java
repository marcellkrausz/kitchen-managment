package kitchenmanagement;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

public class Chef extends CookerEmployee {
    private final Random random = new Random();
    private IngredientStore store;

    public Chef(String name, LocalDate birthDate, int salary) {
        super(name, birthDate, salary);
    }

    public void setStore(IngredientStore store) {
        this.store = store;
    }

    @Override
    protected void cookWithKnives() {
        boolean shouldAskForIngredient = random.nextBoolean();

        if (!shouldAskForIngredient || store == null) {
            return;
        }

        Ingredient randomIngredient = Ingredient.randomIngredient();
        System.out.format("I need %s\n", randomIngredient);
        Optional<Ingredient> received = store.requestIngredient(randomIngredient);
        String ingredientName = received.map(Ingredient::toString).orElse("NOTHING");
        System.out.println("I got " + ingredientName);
    }
}
