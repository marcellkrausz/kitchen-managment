package kitchenmanagement;

import java.time.LocalDate;

public class Cook extends CookerEmployee {

    public Cook(String name, LocalDate birthDate, int salary) {
        super(name, birthDate, salary);
    }

    public void cookWithKnives() {
        System.out.println("I'm cooking");
    }
}
