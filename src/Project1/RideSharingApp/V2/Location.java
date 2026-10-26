package Project1.RideSharingApp.V2;

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

    public double calcDistance(Location location) {
//        Euclidean distance
        double dx=this.getLatitude()-location.getLatitude();
        double dy=this.getLongittude()-location.getLongittude();
        return Math.sqrt(dx*dx + dy*dy);
    }
}
