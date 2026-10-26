package Project1.RideSharingApp.V2;

import java.awt.image.CropImageFilter;
import java.util.ArrayList;
import java.util.List;

public class RideMatching {

    List<Driver> availblefdrivers=new ArrayList<>();

    public void addDrivers(Driver driver){
        availblefdrivers.add(driver);
    }

    public void requestRide(Passenger passenger,double distance,FareStratergy fareStratergy){
        if(availblefdrivers.isEmpty()){
            passenger.notify("No drivers are unavailable");
            return;
        }
//    find the nearest driver
        Driver nearestDriver=findNearestDriver(passenger.getLocation());


//        passenger.notify("Your Ride is SuccesFully Schedule");
        Ride ride=new Ride(passenger,nearestDriver,distance,fareStratergy);

        ride.calculateFare();


        passenger.notify("Ride scheduled with fare  Rs " + ride.getFare());
        nearestDriver.notify("You have a new ride request for " + ride.getFare());

        //        change the status of Ride
        ride.updateStatus(RideStatus.ONGOING);

        ride.updateStatus(RideStatus.COMPLETED);
        availblefdrivers.remove(nearestDriver);


    }

    private Driver findNearestDriver(Location passengerlocation) {
        Driver assignedDriver=null;
        double minDist=Double.MAX_VALUE;

        for(Driver driver:availblefdrivers){
            double distance=driver.getLocation().calcDistance(passengerlocation);
            if(distance<minDist){
                distance=minDist;
                assignedDriver=driver;
            }
        }
        return assignedDriver;
    }


}
