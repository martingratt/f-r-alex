package at.ac.fh_kufstein;

import at.ac.fh_kufstein.classes.Bike;
import at.ac.fh_kufstein.classes.Car;

/**
 * Created by marti on 01.02.2017.
 */
public class Aufruf {
    public static void main (String []args){
        Car auto1 = new Car("rot", 4, 200);

        auto1.currentSpeed();
        auto1.accelerate(50);
        auto1.currentSpeed();
        auto1.slowdown(70);
        auto1.currentSpeed();
        System.out.println();

        Bike motorrad1 = new Bike("blau", 2, 20, 40);



        motorrad1.accelerate(10);
        motorrad1.currentSpeed();
        motorrad1.slowdown(40);
        motorrad1.currentSpeed();
        System.out.println();



        Bike motorrad2 = new Bike("grün", 2, 20, 50);


        motorrad2.accelerate(200);
        motorrad2.slowdown(250);
        motorrad2.currentSpeed();











    }
}
