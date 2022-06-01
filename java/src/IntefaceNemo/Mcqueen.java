package IntefaceNemo;

public class Mcqueen extends Machine implements Runable{
    public Mcqueen(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(getName() + ": xe đua");
    }
}
