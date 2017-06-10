package at.ac.fh_kufstein;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Martin on 23.01.2017.
 */
public class Aufgabe3 extends Throwable {

    public static void main(String[] args) {

            String email = JOptionPane.showInputDialog("Geben Sie eine gültige E-Mail Adresse ein");
            checkEmail(email);

    }

        public static void checkEmail(String email)
    {
        Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
        Matcher m = pattern.matcher(email);

        if(m.find()==false)
        {
            System.out.println("ungültig");
        }

        else
        {
            System.out.println(email);
        }

        }
    }
