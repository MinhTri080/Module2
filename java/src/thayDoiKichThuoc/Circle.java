package thayDoiKichThuoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean test) {
        super(color, test);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "a Circle with radius is :"
                + getRadius()
                +"  and which is a subclass of  "
                + super.toString();
    }
}
