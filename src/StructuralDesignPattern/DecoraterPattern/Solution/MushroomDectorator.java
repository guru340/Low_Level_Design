package StructuralDesignPattern.DecoraterPattern.Solution;

public class MushroomDectorator extends PizzaDecorter{

    public MushroomDectorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription()+", Mushroom";

    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost()+1;
    }
}
