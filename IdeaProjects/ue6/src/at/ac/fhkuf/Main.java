package at.ac.fhkuf;

import at.ac.fhkuf.Classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Fahrzeug bmw = new Auto((short)4, "silber", 220, (short) 5,(short) 4);
        Fahrzeug audi = new Auto((short)4, "schwarz",180,(short) 5, (short) 8);
        Fahrzeug titanic = new Wasserfahrzeug((short) 0, "blau", 51000,(short)0, 10.54, (short)3, 100000);

        List<Fahrzeug> meineFahrzeuge = new ArrayList<Fahrzeug>();
        meineFahrzeuge.add(bmw);
        meineFahrzeuge.add(audi);
        meineFahrzeuge.add(titanic);

        for(Fahrzeug fahrzeug : meineFahrzeuge){
            System.out.println(fahrzeug.toString());
        }
        System.out.println("Fahrzeuge gesamt: "+Fahrzeug.getAnzahl());

    }
}
