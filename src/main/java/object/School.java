package object;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "leo";
        student1.phone = "123456789";
        student1.email = " Leo@gmail.com";
        student1.age = 18;
        student1.major = "Law";

        Student student2 = new Student();
        student2.name = "Potato";
        student2.phone = "0987654321";
        student2.email = "popato@gmail.com";
        student2.age = 17;
        student2.major = "Accounting";

        student1.attendClass();
        student2.attendClass();

        student1.printInfo();


    }


}
