package at.ac.fh_kufstein;



import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverAnonymous;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Aufgabe 1

        /*int[] list11 = new int[5];
        int [][] list12 = new int[5][2];


        for (int value:list12){
            System.out.println(list12[value]);

            ArrayList<Integer> arrayliste1 = new ArrayList<>();
            */

        //Aufgabe 5

        Student student1 = new Student();
        student1.setName("Martin");
        student1.setJahrgang("1994");
        student1.setMatklnr("1610653951");

        Student student2 = new Student();
        student2.setName("Stefan");
        student2.setJahrgang("1995");
        student2.setMatklnr("1610632941");

        Student student3 = new Student();
        student3.setName("Christian");
        student3.setJahrgang("1984");
        student3.setMatklnr("161056453");

        ArrayList<Student> studentenliste1 = new ArrayList<>();
        studentenliste1.add(student1);
        studentenliste1.add(student2);
        studentenliste1.add(student3);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());



            //Aufgabe 2

        int[] list2 = new int[Integer.parseInt(JOptionPane.showInputDialog("Wie viele Werte soll das Array haben?"))];

        for(int i = 0; i < list2.length; i++){
            Random random = new Random();
            list2[i] = random.nextInt(1000);
            System.out.println(i+1+ ". Stelle " +list2[i]);

            }



        //Wie könnte ich hier die stelle einbauen--------------------------------------------------------------------------------------------------------------------------------------------
        for (int c = list2.length-1; c >= 0; c--){
            int counter = list2.length;

            System.out.println(list2[c]);
        }

        //Aufgabe 3

        int[] list3 = new int[100];

        for (int i = 0; i < list3.length; i++) {
            Random random = new Random();
            list3[i] = random.nextInt(1000);
        }

        int a = Integer.parseInt(JOptionPane.showInputDialog("Welche Stelle wollen Sie ändern"));
        JOptionPane.showMessageDialog(null, "Der Wert an der " +a+". Stelle ist " +list3[a]);
        list3[a]=  Integer.parseInt(JOptionPane.showInputDialog("Wie soll der neue Wert an der " +a+ ". Stelle lauten?"));
        JOptionPane.showMessageDialog(null, "Der Wert an der " +a+". Stelle ist nun "+list3[a]);


        //Aufgabe 4

        Freunde f1 = new Freunde();
        f1.setName(JOptionPane.showInputDialog("Bitte geben Sie Ihren ersten Freund ein!"));

        Freunde f2 = new Freunde();
        f2.setName(JOptionPane.showInputDialog("Bitte geben Sie Ihren zweiten Freund ein!"));

        Freunde f3 = new Freunde();
        f3.setName(JOptionPane.showInputDialog("Bitte geben Sie Ihren dritten Freund ein!"));

        Freunde f4 = new Freunde();
        f4.setName(JOptionPane.showInputDialog("Bitte geben Sie Ihren vierten Freund ein!"));

        Freunde f5 = new Freunde();
        f5.setName(JOptionPane.showInputDialog("Bitte geben Sie Ihren fünften Freund ein!"));

        ArrayList<Freunde> list4 = new ArrayList<>();
        list4.add(f1);
        list4.add(f2);
        list4.add(f3);
        list4.add(f4);
        list4.add(f5);

        for (Freunde j:list4){
            System.out.println(j);
        }







    }
}
