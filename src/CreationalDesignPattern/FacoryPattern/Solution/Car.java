package CreationalDesignPattern.FacoryPattern.Solution;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver By Car");
    }
}
