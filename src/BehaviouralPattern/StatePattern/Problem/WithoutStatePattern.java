package BehaviouralPattern.StatePattern.Problem;

public class WithoutStatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(Transportation.TRAIN);
        directionService.setMode(Transportation.CAR);

        System.out.println(directionService.getDirection());
        directionService.getETA();
    }
}