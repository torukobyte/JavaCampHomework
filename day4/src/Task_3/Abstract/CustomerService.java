package Task_3.Abstract;

import Task_3.Entities.Customer;

public interface CustomerService {
    void create(Customer customer) throws Exception;
    void update(Customer customer);
    void delete(Customer customer);
}
