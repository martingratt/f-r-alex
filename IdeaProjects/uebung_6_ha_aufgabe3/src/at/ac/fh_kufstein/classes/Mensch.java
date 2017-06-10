package at.ac.fh_kufstein.classes;

/**
 * Created by marti on 22.12.2016.
 */
public class Mensch {
    private String vorname;
    private String nachname;
    private int alter;

    public Mensch(String vorname, String nachname, int alter){
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setAlter(alter);
    }
    public Mensch(){

    }

    public void status(){
        System.out.println("Es handelt sich um den Mensch " +this.getVorname()+ " " + this.getNachname()+ " welcher " +this.getAlter()+" Jahre alt ist.");

    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
