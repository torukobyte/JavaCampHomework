package day2;

public class Course {

    public Course(int id, double price, String name, String tutor, String detail) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.tutor = tutor;
        this.detail = detail;
    }

    int id;
    double price;
    String name;
    String tutor;
    String detail;
    boolean flag = false;
}
