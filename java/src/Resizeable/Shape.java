package Resizeable;

public class Shape {
    private String name;
    private boolean filled;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", filled=" + filled +
                '}';
    }
}
