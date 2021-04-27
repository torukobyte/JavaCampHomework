package day2;

public class CourseManager {
    public void joinToCourse(Course course) {
        System.out.println(course.name + " adlı kursa başarıyla katıldınız.");
        course.flag = true;
    }

    public void leaveToCourse(Course course) {
        if (course.flag) {
            System.out.println(course.name + " adlı kurstan ayrıldınız..");
        }
        else{
            System.out.println("Bu kursa kayıtlı değilsiniz!");
        }
    }
}
