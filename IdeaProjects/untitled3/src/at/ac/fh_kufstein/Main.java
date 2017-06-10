package at.ac.fh_kufstein;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
		try {
		    int array1 [] = {Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl eingebebn"))};
        } catch (IOException ex){
		    System.out.println("Hala Madrid");
        }

    }
}
