package StructuralDesignPattern.FlyWieghtPattern.Solution;

public class Bullet {
    private String color; //Intrinsic property shared by all buy
    private int x,y; // Extrinsic properties unique to each
    private int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet at (" + x + ", " + y + ") with velocity " + velocity);
    }

    public void display() {
        System.out.println("Bullet at (" + x + ", " + y + ") moving at velocity " + velocity);
    }
}
