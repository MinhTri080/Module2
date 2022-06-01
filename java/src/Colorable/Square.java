package Colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void howtoColor() {
        System.out.println("aaa");
    }

}
