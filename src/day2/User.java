package day2;

public class User {
    int id;

    public User(int id, String name, String email, String password) {
		
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    String name;
    String email;
    String password;
    boolean isRegister = false;
}
