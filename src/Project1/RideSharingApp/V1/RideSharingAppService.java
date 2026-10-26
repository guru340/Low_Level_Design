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
            boolean status=true;
            for(Driver driver:drivers){
                if(status){
                    driver.setStatus(DriverStatus.AVAILABLE);
                    double currentDriverDistance= calcDistance(passenger.getLocation(),Driver.getLocation());
                    if (currentDriverDistance<minDistance){
                        minDistance=currentDriverDistance;
                        assignedDriver=driver;
                    }
                }
                else{
                    driver.setStatus(DriverStatus.BOOKED);
                }


            }

//            calculate fare
            double expectedFare= calcFare(assignedDriver.getVehicle(),distance);







//            Show the driver and fare for passenger
            System.out.println("Ride booked for "+passenger.getName() + " with driver " + assignedDriver.getName() + " for a fare of " + expectedFare);
            System.out.println("Driver is on the way" + assignedDriver.getName());



        }

    private double calcDistance(Location location, Location location1) {
//        Euclidean distance
        double dx=location.getLatitude()-location1.getLatitude();
        double dy=location.getLongittude()-location1.getLongittude();
        return Math.sqrt(dx*dx + dy*dy);
    }

    private double calcFare(Vehicle vehicle, double distance) {
        if (vehicle.vehicletype.equals("Car")){
            return distance*20;
        } else if (vehicle.vehicletype.equals(10)) {
                    return distance*10;

        }
        else {
            return distance*8;
        }
    }
}
