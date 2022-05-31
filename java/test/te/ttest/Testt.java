package te.ttest;

import demo_Interface.Circle;
import demo_Interface.Rectangle;
import demo_Interface.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testt {
    @Test
    public void testCircle() {
        Circle circle = new Circle(2);
        double before = circle.getRadius();
        circle.resize(50);
        Assertions.assertEquals(before * ((double) 50 / 100), circle.getRadius());
    }

    @Test
    public void testSquare() {
        Square square = new Square(2);
        square.resize(50);
        Assertions.assertEquals(1, square.getArea());
    }

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(2, 6);
        rectangle.resize(50);
        Assertions.assertEquals(1, rectangle.getWidth(), "Width invalid");
        Assertions.assertEquals(3, rectangle.getHeight(), "Height invalid");
        Assertions.assertEquals(3, rectangle.getArea(), "Area invalid");
    }
}
