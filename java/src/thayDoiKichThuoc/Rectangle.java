package thayDoiKichThuoc;

public class Rectangle extends Shape{
    private double width = 2.0;
    private double length = 2.0;
    public Rectangle(){

    }
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length,double width,String color,boolean test){
        super(color, test);
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(){
        this.length =length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(){
        this.width = width;
    }
    public double getArea(){
        return width*this.length;
    }
    public double getPerimeter(){
        return 2*(width*this.length);
    }
    @Override
    public String toString(){
        return "a Rectangle with width ="
                + getWidth()
                + "  and with length =  "
                + getLength()
                + "  which is a subclass of  "
                +super.toString();

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3,3);
        System.out.println(rectangle);
        rectangle = new Rectangle(3,3,"black",false);
        System.out.println(rectangle);
    }
}
