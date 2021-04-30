public class UserManager {
    public void register() {
    }

    public void multipleRegister(User[] users){
        System.out.println(users.length+" kullanıcı başarıyla sisteme kayıt edildi!");
    }

    public void login(User user) {
        System.out.println(user.getUsername() + " kullanıcı adına sahip kullanıcımız giriş yaptı!");
    }

    public void logout(User user) {
        System.out.println(user.getUsername() + " kullanıcı adına sahip kullanıcımız çıkış yaptı!");
    }
}
