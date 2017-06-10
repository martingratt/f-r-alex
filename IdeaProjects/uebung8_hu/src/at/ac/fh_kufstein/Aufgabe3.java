package at.ac.fh_kufstein;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Johnny on 23.01.2017.
 */
public class Aufgabe3 {

    public static void main(String [] args)
    {
        try
        {
            EmailChecker(JOptionPane.showInputDialog("Geben sie ihre E-Mail ein!"));
        }
        catch (Exception e)
        {
            System.err.println("Das ist keine E-mail!");
            e.printStackTrace();
        }

    }
    public static void EmailChecker (String email) throws Exception
    {
        Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
        Matcher m = pattern.matcher(email);

        if (m.find())
        {
            System.out.println(email);
        }
        else
        {
            throw new Exception();

        }


    }
}
