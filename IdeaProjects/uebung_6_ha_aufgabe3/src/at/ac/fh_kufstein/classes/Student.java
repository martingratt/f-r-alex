package at.ac.fh_kufstein.classes;

/**
 * Created by marti on 22.12.2016.
 */
public class Student extends Mensch {
    private int matrikelnummer;
    private String studiengang;

    public Student(String s){};

    public Student (int matrikelnummer, String studiengang, String vorname, String nachname, int alter){
        this.setMatrikelnummer(matrikelnummer);
        this.setStudiengang(studiengang);
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setAlter(alter);
    }

    public void status(){
        System.out.println
                ("Es handelt sich um den Studierenden " +this.getVorname()+ " " + this.getNachname()+ " mit der Matrikelnummer " +this.getMatrikelnummer()+" welcher " +this.getAlter()+" Jahre alt ist und "+this.getStudiengang()+" studiert");


    }


    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }
}
