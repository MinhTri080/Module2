package Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]= new Circle(5.0,"red");
        shapes[1]= new Rectangle(4,3);
        shapes[2]= new Square(3);
        for (Shape shape : shapes){
            System.out.println(shape.toString());
            System.out.println("diện tích :"+ shape.getArea());
            if(shape instanceof Square){
                ((Square) shape).howtoColor();
            }
        }
//
    }
}
