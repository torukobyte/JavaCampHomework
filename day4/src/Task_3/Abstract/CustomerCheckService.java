package Task_3.Abstract;

import Task_3.Entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
