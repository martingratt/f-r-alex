package at.ac.fh_kufstein;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Martin", "Gratt");
        student1.nameaufrufen(student1.getVorname(), student1.getnachname());

        ArrayList<Student> list1 = new ArrayList<>();
        
        list1.add(student1);

        int i = 1;
        Random random = new Random();

        int liste2 [][] = new int[5][6];
        for (int j=0; j<liste2.length; j++)
            for (int k=0; k<liste2[j].length; k++)
                liste2[j][k] = random.nextInt(10000)+1;

        for (int [] l : liste2)
            for (int m : l){
                System.out.println(m);

        }

        int a = Integer.parseInt(JOptionPane.showInputDialog("1, 2 oder 3 eingeben"));

        Student.einszweioderdrei(a);










    }
}
