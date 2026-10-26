package Project1.RideSharingApp.V2;

import Project1.RideSharingApp.V1.Vehicle;

public class Driver extends User{

    private Vehicle vehicle;
    public Driver(String name, String email, Location location ,Vehicle vehicle) {
        super(name, email, location);
        this.vehicle=vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String notify(String msg) {
        return msg;
    }
}
