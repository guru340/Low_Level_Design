package CreationalDesignPattern.FacoryPattern.Solution;

public class Bike implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver by Bike");
    }
}
