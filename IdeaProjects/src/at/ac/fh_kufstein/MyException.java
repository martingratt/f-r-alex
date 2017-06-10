package at.ac.fh_kufstein;

/**
 * Created by marti on 01.02.2017.
 */
public class MyException extends Exception {

    MyException(){
        super("Division durch 0 nicht möglich");
        System.out.println("Jaja");


    }

}
