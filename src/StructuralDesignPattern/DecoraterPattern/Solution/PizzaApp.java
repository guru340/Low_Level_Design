package StructuralDesignPattern.DecoraterPattern.Solution;

public class PizzaApp {
    static void main() {
        Pizza pizza=new BasicPizza();
        pizza=new CheeseDecorter(pizza);
        pizza=new OliveDectorator(pizza);
        pizza=new MushroomDectorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
