package StructuralDesignPattern.FacadePattern.Solution;

public class Client {
    public static void main(String[] args) {
        // Client code interacting with different services directly
        APIGateway apiGateway=new APIGateway();
        System.out.println(apiGateway.getFullOrderDetails("123","786","985"));


    }
}
