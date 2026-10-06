package CreationalDesignPattern.FacoryPattern.Solution;

public class TransportFactory {

    public static Transport createTransport(String Type){
        switch (Type.toLowerCase()){
            case "car":
                return new Car();

            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Unsupported Transport Type");
        }

    }
}
