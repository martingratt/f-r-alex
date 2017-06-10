package at.ac.fh_kufstein;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

    int zahl1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie eine ganze Zahl ein"));

    System.out.println(Integer.toBinaryString(zahl1));

    }
}

