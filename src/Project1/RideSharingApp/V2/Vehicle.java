package Project1.RideSharingApp.V2;


abstract class Vehicle {

    protected String numberplate;

    public Vehicle(String numberplate) {
        this.numberplate = numberplate;
    }

    public abstract double getfareperKm();
}
