package Dang_Ba_Hau;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "" +
                "could be fried";
    }
}
