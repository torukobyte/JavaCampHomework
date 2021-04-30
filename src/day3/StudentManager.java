package day3;

public class StudentManager extends UserManager{
    @Override
    public void register() {
        System.out.println("Öğrencimiz kayıt oldu..");
    }
    public void addComment(Student student){ // hocaların yorum yapamaması için Student student
        System.out.println(student.getUsername()+": yorumunuz başarıyla eklendi!");
    }
}
