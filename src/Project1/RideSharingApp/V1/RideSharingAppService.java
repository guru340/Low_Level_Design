package Project1.RideSharingApp.V1;


import java.util.ArrayList;
import java.util.List;


public class RideSharingAppService {
//    Matching Service

    List<Driver> drivers=new ArrayList<>();
    List<Passenger> passengerList=new ArrayList<>();

    // Method to add Passengers and Drivers
        public void addDrivers(Driver driver){
            drivers.add(driver);
        }

        public void addPassengers(Passenger passenger){
            passengerList.add(passenger);
        }

//        Booking Ride
        public void bookRide(Passenger passenger,double distance){
//            corner case
            if(drivers.isEmpty()){
                System.out.println("No drivers are available for :" + passenger.name);
                return;
            }

//            Hard-code assignment logic
//            find the nearest driver
//            0(N) Brute Force
            Driver assignedDriver=null;
            double minDistance=Double.MAX_VALUE;

            for(Driver driver:drivers){
                double currentDriverDistance= calcDistance(passenger.location,Driver.location);
                if (currentDriverDistance<minDistance){
                    minDistance=currentDriverDistance;
                    assignedDriver=driver;
                }

            }

//            calculate fare
            double expectedFare= calcFare(assignedDriver.vehicle,distance);

//            Show the driver and fare for passenger
            System.out.println("Ride booked for "+passenger.name + " with driver " + assignedDriver.name + " for a fare of " + expectedFare);
            System.out.println("Driver is on the way" + assignedDriver.name);



        }
}
