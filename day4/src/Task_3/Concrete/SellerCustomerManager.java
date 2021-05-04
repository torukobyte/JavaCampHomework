package Task_3.Concrete;

import Task_3.Abstract.BaseSellerManager;
import Task_3.Adapters.SellerServiceAdapter;
import Task_3.Entities.Customer;
import Task_3.Entities.Game;

public class SellerCustomerManager extends BaseSellerManager {
    SellerServiceAdapter sellerServiceAdapter;

    public SellerCustomerManager(SellerServiceAdapter sellerServiceAdapter) {
        this.sellerServiceAdapter = sellerServiceAdapter;
    }

    @Override
    public void sell(Game game, Customer customer) {
        game.setPrice(this.sellerServiceAdapter.priceAfterDiscount(game));
        super.sell(game, customer);
    }
}
