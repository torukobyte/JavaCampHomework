import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GoogleAuthManagerAdapter;
import dataAccess.concretes.HiberbanteUserDao;
import entites.concretes.User;
import googleAuth.GoogleAuthManager;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserManager(new HiberbanteUserDao(), new GoogleAuthManagerAdapter(new GoogleAuthManager()));

        User burak = new User(1, "Burak", "KALAYCI", "torukobyte@gmail.com", "230596");

        User goku = new User(2, "Goku", "Son", "torukobyte@gmail.com", "160484");

        User eminem = new User(3, "Marshall", "Mathers", "eminem@eminem.com", "171072");

        User semih = new User(4, "Semih", "KALAYCI", "semih@gmail.com", "240493");

        userService.register(burak);
        userService.register(goku);
        userService.confirm(burak);
        System.out.println("------------------------------------------------------------------------------------------");
        userService.register(eminem);
        userService.login(eminem);
        System.out.println("------------------------------------------------------------------------------------------");
        userService.confirm(eminem);
        userService.login(eminem);
        userService.login(burak);
        System.out.println("------------------------------------------------------------------------------------------");
        userService.loginWithGoogle(semih);
        userService.registerWithGoogle(semih);
        userService.loginWithGoogle(semih);


    }

}
