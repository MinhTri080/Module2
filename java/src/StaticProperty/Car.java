package StaticProperty;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
    public Car (String name, String engine){
        this.name =name;
        this.engine =engine;
        numberOfCar++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEngine(){
        return engine;
    }
    public void setEngine(){
        this.engine = engine;
    }
    void display(){
        System.out.println(name + "  "+ engine + "  "+ numberOfCar);
    }
}
