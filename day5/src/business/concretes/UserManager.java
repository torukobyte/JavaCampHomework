package business.concretes;

import business.abstracts.UserService;
import core.AuthService;
import core.EmailValidator;
import dataAccess.abstracts.UserDao;
import entites.concretes.User;

public class UserManager implements UserService {

    private UserDao userDao;
    private AuthService authService;

    public UserManager(UserDao userDao, AuthService authService) {
        this.userDao = userDao;
        this.authService = authService;
    }

    @Override
    public void register(User user) {
        for (User users : userDao.getUsers()) {
            if (users.getEmail().equals(user.getEmail())) {
                System.out.println("Girmiş olduğunuz email sistemde mevcut,lütfen başka bir email deneyiniz! ");
                return;
            }
        }
        if (!EmailValidator.emailFormatController(user.getEmail())) {
            System.out.println("Hata: Mail formata uygun değil!");
        } else if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println("Ad ve soyad en az iki karakterden oluşmalıdır!");
        } else if (user.getPassword().length() < 6) {
            System.out.println("Parola en az altı karakterden oluşmalıdır!");
        } else {
            userDao.register(user);
        }

    }

    @Override
    public void login(User user) {
        if (user.isFlag()) {
            userDao.login(user);
        } else {
            System.out.println("Giriş başarısız, " + user.getEmail() + " : adresine gönderilen mail dorğulanmamış!");
        }
    }

    @Override
    public void confirm(User user) {
        userDao.confirm(user);
    }

    @Override
    public void registerWithGoogle(User user) {
        user.setFlag(true);
        this.authService.register(user);
    }

    @Override
    public void loginWithGoogle(User user) {
        if (user.isFlag()) {
            this.authService.login(user);

        } else {
            System.out.println("Kayıt olmadan giriş yapamazsınız!");
        }
    }
}
