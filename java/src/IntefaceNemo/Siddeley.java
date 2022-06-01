package IntefaceNemo;

public class Siddeley extends Machine implements Flyable{
    public Siddeley(String name){
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(getName() +": máy bay chiến đấu");
    }
}
