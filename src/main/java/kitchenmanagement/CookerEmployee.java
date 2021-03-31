package kitchenmanagement;

import java.time.LocalDate;

public abstract class CookerEmployee extends Employee {

    private boolean hasKnife;

    public CookerEmployee(String name, LocalDate birthDate, int salary) {
        super(name, birthDate, salary);
    }

    public void receiveKnife() {
        hasKnife = true;
    }

    public boolean isHasKnife() {
        return hasKnife;
    }

    public final void cook() {
        if (!hasKnife) {
            String formatString = "Can't cook: The employee %s hasn't received their knife set yet.";
            String message = String.format(formatString, toString());
            throw new IllegalStateException(message);
        }
        cookWithKnives();
    }

    protected abstract void cookWithKnives();
}
