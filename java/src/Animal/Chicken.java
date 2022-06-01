package Animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Gà gáy :ò ó o";
    }

    @Override
    public String howToEat() {
        return "Gà ăn thóc";
    }
}
