package Task_3.Entities;

import java.util.Date;

public class Seller extends Customer{
    private String taxNumber;

    public Seller() {
    }

    public Seller(int id, String firstName, String lastName, Date birthDate, String email, String password, String nationalIdentity, String taxNumber) {
        super(id, firstName, lastName, birthDate, email, password, nationalIdentity);
        this.taxNumber = taxNumber;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
