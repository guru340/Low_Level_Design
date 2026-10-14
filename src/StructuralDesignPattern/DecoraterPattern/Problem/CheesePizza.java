package StructuralDesignPattern.DecoraterPattern.Problem;

public class CheesePizza extends BasicPizza{
    @Override
    public String getDescription() {
        return super.getDescription()+ ", Pizza";
    }

    @Override
    public double getCost() {
        return super.getCost()+1;
    }
}
