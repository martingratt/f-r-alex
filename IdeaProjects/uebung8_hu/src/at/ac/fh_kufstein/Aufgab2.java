package at.ac.fh_kufstein;

import javax.swing.*;

/**
 * Created by marti on 02.02.2017.
 */
public class Aufgab2 {




        public static void main(String[] args) {
            // write your code here

            while(true){
                String value = JOptionPane.showInputDialog("Bitte geben Sie keine Zahl ein!");

                if(tryParse(value)){
                    break;
                } else {
                    System.out.println(value);
                    //TODO: write to Database
                }

            }

        }

        public static boolean tryParse(String value){
            boolean isParseable = false;
            try{
                int intVAlue = Integer.parseInt(value);
                isParseable = true;
            } catch (NumberFormatException ex){
                isParseable = false;
            }
            return isParseable;
        }
    }


