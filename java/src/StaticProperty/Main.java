package StaticProperty;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCar);
        car1.display();
        car2.display();
    }
}
