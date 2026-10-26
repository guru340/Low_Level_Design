package Project1.RideSharingApp.V2;

public interface FareStratergy {
    double calcFare(Vehicle vehicle,double distance);
}

class StandardFare implements  FareStratergy{

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getfareperKm()*distance;
    }
}

class SharedFare implements FareStratergy{

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getfareperKm()*distance*.50;
    }
}

class luxuryFare implements FareStratergy{

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getfareperKm()*distance*1.5;
    }
}