package business.abstracts;

import entites.concretes.User;

public interface UserService {

    void register(User user);

    void login(User user);

    void confirm(User user);

    void registerWithGoogle(User user);

    void loginWithGoogle(User user);
}
