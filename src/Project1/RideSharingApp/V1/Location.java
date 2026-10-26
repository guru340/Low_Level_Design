package Project1.RideSharingApp.V1;

public class Location {

    private double latitude;

    private double longittude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongittude() {
        return longittude;
    }

    public void setLongittude(double longittude) {
        this.longittude = longittude;
    }

    public Location(double latitude, double longittude) {
        this.latitude = latitude;
        this.longittude = longittude;
    }
}
