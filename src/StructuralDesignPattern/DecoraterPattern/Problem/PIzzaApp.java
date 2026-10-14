package StructuralDesignPattern.DecoraterPattern.Problem;

public class PIzzaApp {
    static void main() {

        Pizza pizza=new CheeseOlivesPizza();

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
