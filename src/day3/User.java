package day3;

public class User {
    int id;
    String firstName;
    String lastName;
    String email;
    String password;
    // olurda kullanıcı çağırırsa null değer döner diye private yapıp sadece okunabilir hale getirdim get ile
    private String profilePicture; // varsayılan olarak tüm isimlere ait bir jpg dosyası olduğunu hayal ederek yazacağım.
    String phoneNumber;
    String username;

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
