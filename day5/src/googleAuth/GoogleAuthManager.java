package googleAuth;

import entites.concretes.User;

public class GoogleAuthManager {

    public void register(User user) {
        System.out.println(user.getFirstName()+" : Google ile kayıt olundu.");
    }

    public void login(User user) {
        System.out.println(user.getFirstName()+" : Google ile giriş yapıldı.");
    }

}
