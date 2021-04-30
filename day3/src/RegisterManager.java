public class RegisterManager{
    private UserManager userManager;

    public RegisterManager(UserManager userManager) {
        this.userManager = userManager;
    }

    // polymorphism -> çok biçimlilik
    public void register(User user){
        System.out.printf(user.getUsername());
        this.userManager.register();
    }
}
