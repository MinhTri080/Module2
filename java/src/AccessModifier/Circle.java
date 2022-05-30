package AccessModifier;

public class Circle {
    private String color = "red";
    private double radius = 1.0;

    public Circle() {
    }

    ;

    public Circle(double radius) {
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
    void display(){
        System.out.println("radius is :" +getRadius() + " and area is : " +getArea());;
    }

}
