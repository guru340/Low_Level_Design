package StructuralDesignPattern.DecoraterPattern.Solution;

public class OliveDectorator extends PizzaDecorter{
    public OliveDectorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() +",Olives";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() +0.50;
    }
}
