public class User {
    public int id;
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public String phoneNumber;
    // olurda kullanıcı çağırırsa null değer döner diye private yapıp sadece okunabilir hale getirdim get ile
    // getProfilePicture değilde gider örn: burak.profilePicture der ve null değer döner public olursa..
    private String profilePicture; // varsayılan olarak tüm isimlere ait bir jpg dosyası olduğunu hayal ederek yazacağım.
    private String username;

    public User(int id, String firstName, String lastName, String email, String password, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getProfilePicture() {
        return this.firstName+".jpg";
    }

    public String getUsername() {
        return this.firstName+this.lastName+this.id * 1996 / 23 + 05;
    }
}
