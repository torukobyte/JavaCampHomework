package Task_2;

import Task_2.Abstract.BaseCustomerManager;
import Task_2.Adapters.MernisServiceAdapter;
import Task_2.Concrete.NeroCustomerManager;
import Task_2.Concrete.StarbucksCustomerManager;
import Task_2.Entities.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

        // nero için mernis eklenmedi ki fark görülebilsin.Bu yüzden nero service adapter istemiyor.
        BaseCustomerManager customerManager1 = new NeroCustomerManager();

        Customer burak = new Customer();
        burak.id = 1;
        burak.firstName = "Burak";
        burak.lastName = "KALAYCI";
        burak.dateOfBirth = LocalDate.of(1996, 5, 23);
        burak.nationalityId = "1111111111";

        Customer engin = new Customer(2, "Engin", "Demiroğ", LocalDate.of(1985, 1, 6), "010101010");

        customerManager.save(burak);
        customerManager.save(engin); // not a valid person
        System.out.println("----------------------------");
        customerManager1.save(burak);
        customerManager1.save(engin);
    }
}
