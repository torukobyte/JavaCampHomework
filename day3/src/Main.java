public class Main {
    public static void main(String[] args) {

        Student burak = new Student(
                1,
                "Burak",
                "KALAYCI",
                "torukobyte@gmail.com",
                "sha256",
                "001010100100"
                );

        Instructor engin = new Instructor(
                2,
                "Engin",
                "Demirog",
                "asi_engin_61@hotmail.com",
                "eeeennnggiiinnn",
                "911011811711",
                "Seviliyorsunuz hocam.."
        );

        System.out.println(burak.getProfilePicture());
        System.out.println(engin.getProfilePicture());
        System.out.println(burak.getStudentNumber());

        System.out.println("\n---------------------------------\n");
        RegisterManager registerManager = new RegisterManager();
        registerManager.register(new InstructorManager()); //saçma bir örnek oldu ama override i kullanmak istedim pekişmesi için
        registerManager.register(new StudentManager());
        System.out.println("\n---------------------------------\n");

        UserManager userManager = new UserManager();
        userManager.login(engin);
        userManager.login(burak);
        userManager.logout(burak);
        User[] users = {burak,engin};
        userManager.multipleRegister(users); // users.length -> 2 kullanıcı başarıyla kayıt edildi..
        System.out.println("\n---------------------------------\n");

        StudentManager studentManager = new StudentManager();
        studentManager.addComment(burak);
        System.out.println("\n---------------------------------\n");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.updateDetail(engin);


    }
}
