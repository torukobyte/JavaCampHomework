public class Instructor extends User{
    String details;

    public Instructor(int id, String firstName, String lastName, String email, String password, String phoneNumber,String details) {
        super(id, firstName, lastName, email, password, phoneNumber);
        this.details = details;
    }
}
