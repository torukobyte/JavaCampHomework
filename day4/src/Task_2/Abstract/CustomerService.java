package Task_2.Abstract;

import Task_2.Entities.Customer;

public interface CustomerService {

    void save(Customer customer) throws Exception;
    void delete(Customer customer) throws Exception;
}
