package at.ac.fh_kufstein.classes;

/**
 * Created by marti on 01.02.2017.
 */
public class Bike extends Car {

    private double maxspeed;

    public Bike(String color, int wheels, double speed, double maxspeed) {

        this.setColor(color);
        this.setWheels(wheels);
        this.setSpeed(speed);
        this.setMaxspeed(maxspeed);

    }


    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    @Override
    public void accelerate(double increase) {
        if (this.getSpeed() + increase >= this.getMaxspeed()) {
            this.setSpeed(50);
            System.out.println("Höchstgeschwindigkeit erreich");
        } else {
            this.setSpeed(this.getSpeed() + increase);
        }
    }

    @Override
    public void slowdown(double decrease) {
        if (this.getSpeed() - decrease <= 0) {
            this.setSpeed(0);
            System.out.println("Bike steht jetzt");
        } else {
            this.setSpeed(this.getSpeed() - decrease);
        }
    }



    }






