package at.ac.fh_kufstein;

import javax.swing.*;
import java.util.DoubleSummaryStatistics;

public class Main {

    public static void main(String[] args) {
        double eingabe1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte geben Sie einen KB Wert ein!"));
        double ausgabe1= eingabe1/1.024;
        JOptionPane.showMessageDialog(null, eingabe1+" Kb sind " +ausgabe1+ " KiB");

        double eingabe2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte geben Sie einen MB Wert ein!"));
        double ausgabe2= eingabe2/1.048576;
        JOptionPane.showMessageDialog(null, eingabe2+" Mb sind " +ausgabe2+ " MiB");

        double eingabe3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte geben Sie einen GB Wert ein!"));
        double ausgabe3= eingabe3/1.073741824;
        JOptionPane.showMessageDialog(null, eingabe3+" GB sind " +ausgabe3+ " GiB");

        double eingabe4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte geben Sie einen TB Wert ein!"));
        double ausgabe4= eingabe4/1.099511627776;
        JOptionPane.showMessageDialog(null, eingabe4+" TB sind " +ausgabe4+ " TiB");


    }
}
