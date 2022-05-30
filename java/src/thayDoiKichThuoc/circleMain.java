package thayDoiKichThuoc;

public class circleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5.5);
        System.out.println(circle);
        circle = new Circle(3.5,"blue",false);
        System.out.println(circle);
    }
}
