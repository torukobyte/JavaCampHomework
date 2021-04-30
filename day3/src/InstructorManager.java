public class InstructorManager extends UserManager{
    @Override
    public void register() {
        System.out.println("Hocamız kayıt oldu..");
    }

    public void updateDetail(Instructor instructor){
        System.out.println(instructor.getUsername()+": Detay bölümü başarıyla güncellendi!");
    }
}
