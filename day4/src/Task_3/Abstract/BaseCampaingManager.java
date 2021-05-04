package Task_3.Abstract;

import Task_3.Entities.Customer;
import Task_3.Entities.Game;

public abstract class BaseCampaingManager implements CampaingService {
    @Override
    public void create(Game game, Customer customer) {
        game.setDiscount(30);
        System.out.println(customer.getFirstName() + " : " + game.getGameName() + " adlı oyuna %" + game.getDiscount() + " indirim yaptı!");
    }

    @Override
    public void update(Game game, Customer customer) {
        game.setDiscount(30);
        System.out.println(customer.getFirstName() + " : " + game.getGameName() + " adlı oyunun yeni fiyatı : " + game.getPrice());
    }

    @Override
    public void delete(Game game, Customer customer) {
        System.out.println(customer.getFirstName() + " : " + game.getGameName() + " adlı oyunu indirimden kaldırdı!");

    }
}
