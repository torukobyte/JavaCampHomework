package Task_3.Abstract;

import Task_3.Entities.Customer;
import Task_3.Entities.Game;

public abstract class BaseSellerManager implements SellerService {
    @Override
    public void sell(Game game, Customer customer) {
        System.out.println(game.getGameName() + " adlı oyun " + customer.getFirstName() + " adlı kişiye "+game.getPrice() +" TL den satıldı!");
    }

    @Override
    public void relaseGame(Game game, Customer customer) {
        System.out.println(customer.getFirstName()+" : "+game.getGameName()+" adlı oyunu "+game.getPrice()+ " TL den satışa çıkardı!");
    }
}
