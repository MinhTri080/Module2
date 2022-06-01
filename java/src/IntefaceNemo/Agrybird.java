package IntefaceNemo;

public class Agrybird extends Animal implements Flyable{
    public Agrybird(String name){
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(getName() + ": chim giận dữ");

    }


}
