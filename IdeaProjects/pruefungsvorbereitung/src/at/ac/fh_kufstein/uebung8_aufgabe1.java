package at.ac.fh_kufstein;

import javax.swing.*;

/**
 * Created by marti on 02.02.2017.
 */
public class uebung8_aufgabe1 {
    public static void main (String[]args){


            int a = Integer.parseInt(JOptionPane.showInputDialog("Bitte die erste Zahl eingeben!"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Bitte die zweite Zahl eingeben!"));

            if (b!=0){
                double c = a / b;
                System.out.println(c);

            }
            else {System.err.println("Division durch null nicht möglich, ArithmeticException!");}









    }
}
