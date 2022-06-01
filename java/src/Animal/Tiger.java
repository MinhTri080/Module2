package Animal;

public class Tiger extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Hổ : gruuuu gruuu";
    }

    @Override
    public String howToEat() {
        return "Hổ ăn thịt";
    }
}
