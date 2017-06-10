package at.ac.fh_kufstein.Classes;

/**
 * Created by marti on 21.12.2016.
 */
public class Mensch extends Säugetiere{
    private String vorname;
    private String nachname;


    public Mensch(String name, int alter, char geschlecht){
        super(name, alter, geschlecht);

    }





    public void printAll(){
        //
        System.out.println("#" +this.getAlter() + " #"+this.getName() + " #" + this.getGeschlecht());

    }





}
