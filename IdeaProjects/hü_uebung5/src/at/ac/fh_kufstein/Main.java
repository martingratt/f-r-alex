package at.ac.fh_kufstein;

import javafx.beans.binding.ObjectExpression;
import org.omg.CORBA.Object;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        Book buch1 = new Book(10, "16.06.2008 09:27:19", "My Book 1", "asdfasdfasdff");
        Book buch2 = new Book(100, "10.11.2014", "My Book 2", "3210546050");
        Book buch3= new Book(200, "16.06.2008 09:27:19", "My Book 3", "asfdasdfasdf");
        Book buch4 = new Book(130, "16.06.2008 09:27:19", "My Book 4", "asfdasdfasdf");
        Book buch5 = new Book(3000, "16.06.2008 09:27:19", "My Book 5", "asfdasdfasdf");

        buch1.ausgabeInsanz();

        ArrayList<Book> buecher = new ArrayList<>();

        buecher.add(buch1);
        buecher.add(buch2);
        buecher.add(buch3);
        buecher.add(buch4);
        buecher.add(buch5);

        for (Book s : buecher){
            s.ausgabearray();
        }

        Paperbook paperbook1 = new Paperbook("My Paperbook 1", 200,  "July", "asdfasdf");
        Paperbook paperbook2 = new Paperbook("My Paperbook 2", 120,"April", "ayxvcyxcva");
        Paperbook paperbook3 = new Paperbook("My Paperbook 3", 265,"Jänner", "werqwer");
        Paperbook paperbook4 = new Paperbook("My Paperbook 4", 258,"Dezember", "yxcv");
        Paperbook paperbook5 = new Paperbook("My Paperbook 5", 844,"März", "jgasdf");

        System.out.println("--------------------------------------------------------------------------------------------");




        ArrayList<Paperbook> papierbuecher = new ArrayList<>();
        papierbuecher.add(paperbook1);
        papierbuecher.add(paperbook2);
        papierbuecher.add(paperbook3);
        papierbuecher.add(paperbook4);
        papierbuecher.add(paperbook5);

        for (Paperbook b : papierbuecher){
            b.ausgabepaperbook();
        }

















    }
}

