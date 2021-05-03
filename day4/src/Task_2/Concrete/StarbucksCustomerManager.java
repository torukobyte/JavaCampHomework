package Task_2.Concrete;

import Task_2.Abstract.BaseCustomerManager;
import Task_2.Abstract.CustomerCheckService;
import Task_2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {

        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            //System.out.println(customer.firstName + " : Not a valid person!");
            throw new Exception("Not a valid person");
        }
    }
}
