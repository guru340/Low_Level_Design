package Project1.RideSharingApp.V2;

public class Passenger extends  User{
    public Passenger(String name, String email, Location location) {
        super(name, email, location);
    }

    @Override
    public String notify(String msg) {
        return msg;
    }

}
