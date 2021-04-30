public class UserManager {
    public void createAccount(User user) {
        System.out.println("id: " + user.id + " \nname: " + user.name + " \nemail: " + user.email + "\nbilgilerine sahip kullanıcı başarıyla oluşturuldu!");
        System.out.println("--------------------------");

        user.isRegister = true;
    }

    public void deleteAccount(User user) {
        if (user.isRegister) {
            System.out.println("id: " + user.id + " \nname: " + user.name + " \nemail: " + user.email + "\nbilgilerine sahip kullanıcı başarıyla kaldırıldı!");
            System.out.println("--------------------------");

        } else {
            System.out.println("Sistemimize kayıtlı böyle bir kullanıcı bulunamadı!");
            System.out.println("--------------------------");

        }

    }
}
