package at.ac.fh_kufstein;

import javax.swing.*;

/**
 * Created by Martin on 23.01.2017.
 */
public class Aufgabe4{

    public static void main(String[] args)
    {
        try {
            String eingabe = JOptionPane.showInputDialog("Länderkennzeichen eingeben (höchstens 2 Zeichen");

            if(eingabe.length()>2)
            {
                throw new Exception();
            }
            else
            {
                System.out.println(eingabe);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("nur 2 Zeichen eingeben");
        }
    }
}
