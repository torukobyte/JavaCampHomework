package Task_2.Concrete;

import Task_2.Abstract.CustomerCheckService;
import Task_2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        return true;
    }
}
