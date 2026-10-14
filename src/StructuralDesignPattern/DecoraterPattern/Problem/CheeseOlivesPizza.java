package StructuralDesignPattern.DecoraterPattern.Problem;

public class CheeseOlivesPizza extends CheesePizza{
    @Override
    public double getCost() {
        return super.getCost()+0.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ",Olives";
    }
}
