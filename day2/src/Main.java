public class Main {
    public static void main(String[] args) {

        Course course1 = new Course(
                1,
                0,
                "C# + Angular",
                "Engin Demirog",
                "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz."
        );

        Course course2 = new Course(
                2,
                99.85,
                "Java + React",
                "Engin Demirog",
                "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz."
        );

        Course[] courses = {course1, course2};

        for (Course course : courses) {
            if (course.price == 0) {
                System.out.println("id: " + course.id);
                System.out.println("price: " + "Ücretsiz!");
                System.out.println("name: " + course.name);
                System.out.println("tutor: " + course.tutor);
                System.out.println("detail: " + course.detail);
                System.out.println("--------------------------");

            } else {
                System.out.println("id: " + course.id);
                System.out.println("price: " + course.price);
                System.out.println("name: " + course.name);
                System.out.println("tutor: " + course.tutor);
                System.out.println("detail: " + course.detail);
                System.out.println("--------------------------");

            }

        }

        CourseManager courseManager = new CourseManager();
        courseManager.joinToCourse(course1);
        courseManager.leaveToCourse(course1);
        courseManager.leaveToCourse(course2);
        System.out.println("--------------------------");


        User user1 = new User(1, "Burak", "leesout21@gmail.com", "123456");
        User user2 = new User(2, "Engin", "engin@gmail.com", "654321");

        User[] users = {user1, user2};

        for (User user : users) {
            System.out.println("name: " + user.name);
            System.out.println("email: " + user.email);
            System.out.println("--------------------------");

        }

        UserManager userManager = new UserManager();

        userManager.createAccount(user1);
        userManager.deleteAccount(user1);
        userManager.deleteAccount(user2);


    }
}
