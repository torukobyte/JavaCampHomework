package Task_3;

import Task_3.Abstract.BaseCampaingManager;
import Task_3.Abstract.BaseCustomerManager;
import Task_3.Abstract.BaseSellerManager;
import Task_3.Adapters.EdevletServiceAdapter;
import Task_3.Adapters.SellerServiceAdapter;
import Task_3.Concrete.CampaingManager;
import Task_3.Concrete.GamerCustomerManager;
import Task_3.Concrete.SellerCustomerManager;
import Task_3.Entities.Game;
import Task_3.Entities.Gamer;
import Task_3.Entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new GamerCustomerManager(new EdevletServiceAdapter());

        BaseSellerManager baseSellerManager = new SellerCustomerManager(new SellerServiceAdapter());

        BaseCampaingManager campaingManager = new CampaingManager(new SellerServiceAdapter());

        Gamer gamer = new Gamer(
                1,
                "Burak",
                "KALAYCI",
                new Date(1996, 5, 23),
                "torukobyte@gmail.com",
                "asd123",
                "12345678901"
        );

        Seller seller = new Seller(
                2,
                "Goku",
                "Kakarotto",
                new Date(1984, 5, 23),
                "goku@dragonball.com",
                "goku123",
                "098765432110",
                "0721"
        );

        Game gtaV = new Game(
                1,
                "Gta V",
                "Grand Theft Auto V",
                176.25,
                10
        );
        Game battleFieldVI = new Game(
                2,
                "Battlefield 6",
                "Battlefield, birinci şahıs nişancı ve üçüncü şahıs nişancı türü aksiyon oyunları serisidir.",
                399.99,
                10
        );

        customerManager.create(gamer);
        customerManager.update(gamer);
        customerManager.delete(gamer);

        System.out.println("\n-----------------------\n");

        baseSellerManager.sell(gtaV, gamer);
        baseSellerManager.relaseGame(battleFieldVI, seller);

        System.out.println("\n-----------------------\n");

        campaingManager.create(battleFieldVI,seller);
        campaingManager.update(battleFieldVI,seller);
        campaingManager.delete(battleFieldVI,seller);


    }
}
