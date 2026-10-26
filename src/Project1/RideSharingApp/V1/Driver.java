package Project1.RideSharingApp.V1;

import java.util.Locale;

public class Driver {
     String name;
    static Location location;
    Vehicle vehicle;

    public Driver(String name, Location location, Vehicle vehicle) {
        this.name = name;
        this.location = location;
        this.vehicle = vehicle;
    }
}
