package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entites.concretes.User;

import java.util.ArrayList;
import java.util.List;


public class HiberbanteUserDao implements UserDao {

    private final List<User> users = new ArrayList<User>();

    @Override
    public void register(User user) {
        System.out.println("Kayıt olma başarılı, " + user.getEmail() + " adresine gelen doğrulama linkine tıklayınız.");
        users.add(user);
    }

    @Override
    public void login(User user) {
        System.out.println(user.getFirstName() + " : Kullanıcı girişi başarılı!");
    }

    @Override
    public void confirm(User user) {
        System.out.println(user.getEmail() + " : Eposta adresi onaylama işlemi başarılı.İyi eğlenceler..");
        user.setFlag(true);
    }

    @Override
    public List<User> getUsers() {
        return this.users;
    }

}
