package Task_3.Entities;

import java.util.Date;

public class Gamer extends Customer {

    private String userName;

    public Gamer() {

    }

    public Gamer(int id, String firstName, String lastName, Date birthDate, String email, String password, String nationalIdentity) {
        super(id, firstName, lastName, birthDate, email, password, nationalIdentity);
    }

    public String getUserName() {
        return this.getFirstName().toLowerCase() + this.getLastName().toUpperCase() + this.getBirthDate().getYear();
    }
}
