package Colorable;

public class Main {
    public static void main(String[] args) {
//        Shape[] shapes = new Shape[2];
////        shapes[0]= new Circle();
//        shapes[0]= new Rectangle();
//        shapes[1]= new Square(3);
//        for (Shape shape : shapes){
//            System.out.println(shape.toString());
//            System.out.println("diện tích :"+ shape.getArea());
//            if(shape instanceof Square){
//                ((Square) shape).howtoColor();
//            }
//        }
        Circle a = new Circle(5.0, "red");
        System.out.println(a);
    }
}
