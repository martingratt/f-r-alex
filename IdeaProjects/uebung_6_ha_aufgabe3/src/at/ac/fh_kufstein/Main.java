package at.ac.fh_kufstein;

import at.ac.fh_kufstein.classes.Mensch;
import at.ac.fh_kufstein.classes.Student;
import com.sun.org.apache.xalan.internal.xsltc.trax.SmartTransformerFactoryImpl;

public class Main {

    public static void main(String[] args) {
        Mensch mensch1 = new Mensch("Martin", "Gratt", 21);
        mensch1.status();

        Student student1 = new Student(1610653951, "Web Business and Technology", "Martin", "Gratt", 21);
        student1.status();
        //muss ich jetzt mensch1 löschen?
    }
}
