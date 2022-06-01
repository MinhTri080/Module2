package IntefaceNemo;

public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0] = new Bolt("Lucky");
        objects[1] = new Agrybird("Quạ");
        objects[2] = new Mcqueen("BMW");
        objects[3] = new Nemo("Cá vàng");
        objects[4] = new Siddeley("Trực thăng");
        for (Object obj : objects) {
            if (obj instanceof Barkable)
                ((Barkable) obj).bark();
            if (obj instanceof Runable)
                ((Runable) obj).run();
            if (obj instanceof Flyable)
                ((Flyable) obj).fly();
            if (obj instanceof Swimable)
                ((Swimable) obj).swim();

        }
    }
}