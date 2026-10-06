package CreationalDesignPattern.FacoryPattern.Problem;

public class TransportService {
    public static void main(String[] args) {
        Transport car=new Car();
        Transport bus=new Bike();
//        If Now We Add Some Classes or Functionality of Bus We Want to modify the client code
    }
}
