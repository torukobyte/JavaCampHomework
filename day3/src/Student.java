public class Student extends User{
    private int studentNumber;

    public Student(int id, String firstName, String lastName, String email, String password, String phoneNumber) {
        super(id, firstName, lastName, email, password, phoneNumber);
        // otomatik kendi oluşturdu ama this.id = id vs. diye yazcaktım zaten..
        // az önce anladım ne işe yaradığını extend ettiğimiz sınıfın propları için kullanılabiliyor sadece
    }

    public int getStudentNumber() {
        return this.id * 1996 / 23 + 05;
    }
}
