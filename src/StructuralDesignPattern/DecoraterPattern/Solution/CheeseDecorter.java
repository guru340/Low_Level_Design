package StructuralDesignPattern.DecoraterPattern.Solution;

public class CheeseDecorter extends PizzaDecorter{
    public CheeseDecorter(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription()+",Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost()+1;
    }
}
