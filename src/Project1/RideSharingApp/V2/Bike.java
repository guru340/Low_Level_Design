package Project1.RideSharingApp.V2;



public class Bike extends Vehicle {

    public Bike(String numberplate){
        super(numberplate);
    }


    @Override
    public double getfareperKm() {
        return 10;
    }
}