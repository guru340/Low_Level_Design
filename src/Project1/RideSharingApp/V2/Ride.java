package Project1.RideSharingApp.V2;

enum RideStatus{
    SCHEDULED,ONGOING,COMPLETED
}

public class Ride {

    private Passenger passenger;
    private Driver driver;
    private double distance;
    private FareStratergy fareStratergy;
    private double fare;
    private RideStatus status;

    public Ride(Passenger passenger, Driver driver, double distance, FareStratergy fareStratergy) {
        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.fareStratergy = fareStratergy;

        this.status = RideStatus.SCHEDULED;
    }

    public void calculateFare(){
        this.fare= fareStratergy.calcFare(driver.getVehicle(),distance);
    }

    public void updateStatus(RideStatus status){
        this.status=status;
        notifyUser(status);
    }

    private void notifyUser(RideStatus status) {
        passenger.notify("Your ride is  " + status);
        driver.notify("Ride Status : " + status);
    }

    public double getFare(){
        return fare;
    }
}
