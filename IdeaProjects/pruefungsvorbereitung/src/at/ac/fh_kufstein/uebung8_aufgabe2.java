package at.ac.fh_kufstein;

import javax.swing.*;

/**
 * Created by marti on 02.02.2017.
 */
public class uebung8_aufgabe2 {
    public static void main (String[]args){
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Bitte die erste Zahl eingeben!"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Bitte die zweite Zahl eingeben!"));



            double c = a / b;


        }catch (ArithmeticException ex){
            ex.printStackTrace();
            System.out.println("Division durch null nicht möglich!");
        }


    }
}
