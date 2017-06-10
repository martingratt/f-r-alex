package at.ac.fh_kufstein.classes;

/**
 * Created by marti on 01.02.2017.
 */
public class Car {
    private String color;
    private int wheels;
    private double speed;

    public Car(){};

    public Car(String color, int wheels, double speed){
        this.setColor(color);
        this.setWheels(wheels);
        this.setSpeed(speed);
    }

    public  void currentSpeed(){
        System.out.println("Die Geschwindigkeit begrägt: " + this.getSpeed());

    }

    public void accelerate(double geschwindingkeit){
        this.setSpeed(this.getSpeed()+geschwindingkeit);
    }

    public void slowdown(double geschwindkeit){
        this.setSpeed(this.getSpeed()-geschwindkeit);
    }





    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
