package Project1.RideSharingApp.V1;

public class Driver {
     String name;
    static Location location;
    Vehicle vehicle;
    private DriverStatus status;

    public DriverStatus getStatus() {
        return status;
    }

    public void setStatus(DriverStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Location getLocation() {
        return location;
    }

    public static void setLocation(Location location) {
        Driver.location = location;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Driver(String name, Location location, Vehicle vehicle) {
        this.name = name;
        this.location = location;
        this.vehicle = vehicle;
    }
}
