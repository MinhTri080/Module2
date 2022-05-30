package modifierStuden;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
        Student student1 = new Student();
        student1.setName("Joe");
        student1.setClasses("C04");
        student1.display();
    }
}
