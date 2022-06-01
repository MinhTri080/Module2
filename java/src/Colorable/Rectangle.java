package Colorable;

public class Rectangle extends Shape{
    private double height;
    private double width;
    public Rectangle(){

    }
    public Rectangle(double height,double witdh){
        this.height = height;
        this.width = witdh;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return height * width;
    }
    public double getPeriemeter(){
        return (height*width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
    public double getPerimeter(){
        return 0;
    }
}
