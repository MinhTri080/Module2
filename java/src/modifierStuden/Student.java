package modifierStuden;

public class Student {
    public String name = "John";
    public String classes = "C03";

    public Student(){};

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getClasses(){
        return classes;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
    void display(){
        System.out.println("student name is : "
                + getName() +
                " and class is :"
                + getClasses());
    }
}
