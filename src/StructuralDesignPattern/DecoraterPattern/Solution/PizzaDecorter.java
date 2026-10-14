package StructuralDesignPattern.DecoraterPattern.Solution;

abstract class PizzaDecorter implements Pizza{


    public PizzaDecorter(Pizza pizza) {
        this.decoratedPizza = pizza;
    }

    protected  Pizza decoratedPizza;

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }

}
