package Task_3.Adapters;

import Task_3.Entities.Customer;
import Task_3.Abstract.CustomerCheckService;

public class EdevletServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return customer.getNationalIdentity().length() == 11;
    }
}
