package Project1.RideSharingApp.V2;



public class Car extends Vehicle {

    public Car(String numberplate){
        super(numberplate);
    }


    @Override
    public double getfareperKm() {
        return 20;
    }
}
