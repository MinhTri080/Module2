package Animal;

public class Apple extends Fruit implements Edible{
    @Override
    public String howToEat() {
        return "Ăn táo xanh có thể đau bụng";
    }
}
