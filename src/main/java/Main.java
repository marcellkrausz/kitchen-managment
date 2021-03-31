import kitchenmanagement.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        LocalDate oneDate = LocalDate.of(1990, 1, 1);
        Chef chef = new Chef("Chef McCheferson", oneDate, 1000);
        Cook cook1 = new Cook("Cook McCookface", oneDate.plusYears(3), 800);
        Cook cook2 = new Cook("Pan Fryingkind", oneDate.plusYears(-2), 800);
        KitchenHelper helper1 = new KitchenHelper("Helper Helpowitz", oneDate.plusYears(1), 750);
        KitchenHelper helper2 = new KitchenHelper("Handy Smith", oneDate.plusYears(3), 750);
        KitchenHelper helper3 = new KitchenHelper("Slim Quicktohelp", oneDate.plusMonths(4), 750);
        chef.receiveKnife();
        cook1.receiveKnife();
        cook2.receiveKnife();

        List<Employee> employees = List.of(chef, cook1, cook2,
                helper1, helper2, helper3);
        employees.forEach(kitchen::hireEmployee);

        kitchen.conductAShift();
    }
}
