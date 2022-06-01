package IntefaceNemo;

public class Nemo extends Animal implements Swimable{
    public Nemo(String name){
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(getName() + ": cá bơi chảo nóng");
    }
}
