package Task_3.Concrete;

import Task_3.Abstract.BaseCampaingManager;
import Task_3.Adapters.SellerServiceAdapter;
import Task_3.Entities.Customer;
import Task_3.Entities.Game;

public class CampaingManager extends BaseCampaingManager {
    SellerServiceAdapter sellerServiceAdapter;

    public CampaingManager(SellerServiceAdapter sellerServiceAdapter) {
        this.sellerServiceAdapter = sellerServiceAdapter;
    }

    @Override
    public void update(Game game, Customer customer) {
        game.setPrice(this.sellerServiceAdapter.priceAfterDiscount(game));
        super.update(game, customer);
    }
}
