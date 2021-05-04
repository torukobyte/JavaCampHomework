package Task_3.Abstract;

import Task_3.Entities.Customer;
import Task_3.Entities.Game;

public interface SellerService {
    void sell(Game game, Customer customer);
    void relaseGame(Game game,Customer customer);
}
