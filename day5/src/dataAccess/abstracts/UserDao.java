package dataAccess.abstracts;

import entites.concretes.User;

import java.util.List;

public interface UserDao {

    void register(User user);

    void login(User user);

    void confirm(User user);

    List<User> getUsers();

}
