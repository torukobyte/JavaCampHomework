package Task_3.Abstract;

import Task_3.Entities.Customer;
import Task_3.Entities.Game;

public interface CampaingService {
    void create(Game game, Customer customer) throws Exception;
    void update(Game game, Customer customer);
    void delete(Game game,Customer customer);
}
